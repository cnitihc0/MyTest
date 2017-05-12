package com.heye.controll;

import com.alibaba.openapi.client.entity.AuthorizationToken;
import com.alibaba.openapi.sdk.cbusdk.ApiFacade;
import com.alibaba.openapi.sdk.cbusdk.param.*;
import com.alibaba.openapi.util.SignatureUtil;
import com.alibaba.openapi.util.StringUtil;
import org.apache.commons.io.IOUtils;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Convert;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/25.
 */
@RestController
public class AlibabaController {
    String client_id = "5756290";
    String secKey = "pWRa5KUTn3c";
    String site = "china";

    @RequestMapping(method = RequestMethod.GET, value="/adliSQ")
    public void adliSQ(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("client_id", client_id);
        map.put("site", site);
        map.put("redirect_uri", "http://localhost:8080/getAdliSQCode");
        byte[] bytes = SignatureUtil.hmacSha1(map, secKey);
        String aop_signature = StringUtil.encodeHexStr(bytes).toUpperCase();
        String url ="http://gw.open.1688.com/auth/authorize.htm?client_id=" + client_id + "&site=china&redirect_uri=http://localhost:8080/getAdliSQCode&_aop_signature="+ aop_signature;
        response.sendRedirect(url);
    }

    @RequestMapping(method = RequestMethod.GET, value="/getAdliSQCode")
    public void getAdliSQCode(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String code = request.getParameter("code");
        System.out.println("============="+code);
        //创建API访问Facade对象
        ApiFacade apiFacade = new ApiFacade();

        //设置appKey, 密钥
        apiFacade.setAppKey(client_id);
        apiFacade.setSigningKey(secKey);
        //设置访问的开放平台网关地址
        apiFacade.setServerHost("gw.open.1688.com");
        AuthorizationToken authorizationToken = apiFacade.getToken(code);

        System.out.println("======"+authorizationToken.getAccess_token());

        authorizationToken = apiFacade.refreshToken(authorizationToken.getRefresh_token());

        System.out.println("======"+authorizationToken.getAccess_token());
    }

    public static void main(String[] args) throws Exception {
        AlibabaController c = new AlibabaController();

        //创建API访问Facade对象
        ApiFacade apiFacade = new ApiFacade();

        //设置appKey, 密钥
        apiFacade.setAppKey(c.client_id);
        apiFacade.setSigningKey(c.secKey);
        //设置访问的开放平台网关地址
        apiFacade.setServerHost("gw.open.1688.com");

        //设置accesssToken
        String accessToken = "60021d7a-7599-4d90-bf13-a3679ebbdef0";


        AlibabaCategorySearchSPUInfoResult result = searchSPUInfo(apiFacade, accessToken, 122532002l);
        getCatagoryInfos(apiFacade, accessToken);


        //构建API请求入参，该入参对象可以在SDK中找到--开始
        //这里以修改商品库存的API为例子

        AlibabaProductAddParam alibabaProductAddParam = new AlibabaProductAddParam();
        alibabaProductAddParam.setProductType("wholesale");
        alibabaProductAddParam.setCategoryID(122532002l);
        alibabaProductAddParam.setWebSite("1688");


        AlibabaCategoryAttributeGetResult alibabaCategoryAttributeGetResult = CategoryAttributeGet(apiFacade, accessToken, 122532002l);
        // 商品分组

        // 商品属性
        AlibabaproductProductAttribute[] alibabaproductProductAttribute = new AlibabaproductProductAttribute[]{
                new AlibabaproductProductAttribute(1l, "毛色", 1l, "黑色", true),
                new AlibabaproductProductAttribute(2l, "是否进口", 2l, "是", true    )

        };
        alibabaProductAddParam.setAttributes(alibabaproductProductAttribute);

        // SKU信息
        // 商品销售信息

        alibabaProductAddParam.setSubject("商品发布测试-小黑狗");
        alibabaProductAddParam.setDescription("商品发布测试");
        alibabaProductAddParam.setLanguage("CHINESE");
        alibabaProductAddParam.setPeriodOfValidity(200);
        alibabaProductAddParam.setBizType(1);
        alibabaProductAddParam.setPictureAuth(true);
        alibabaProductAddParam.setProductType("wholesale");
        // TODO 图片接口上传

        AlibabaphotobankphotoAlbumDomain alibabaphotobankphotoAlbumDomain = null;
        AlibabaPhotobankAlbumGetListResult alibabaPhotobankAlbumGetListResult = PhotobankAlbumGetList(apiFacade, accessToken);
        if (alibabaPhotobankAlbumGetListResult != null && alibabaPhotobankAlbumGetListResult.getAlbumInfos() != null && alibabaPhotobankAlbumGetListResult.getAlbumInfos().length > 0) {
            alibabaphotobankphotoAlbumDomain = alibabaPhotobankAlbumGetListResult.getAlbumInfos()[0];
        }

        if (alibabaphotobankphotoAlbumDomain == null || alibabaphotobankphotoAlbumDomain.getAlbumID() == null) {
            throw new Exception("相册列表为空");
        }

        File f = new File("C:\\Users\\Administrator\\Desktop\\151654_20170414173920093.png");
        FileInputStream in = new FileInputStream(f);
        byte[] b = IOUtils.toByteArray(in);
        AlibabaphotobankphotoResponseDomain alibabaphotobankphotoResponseDomain = PhotobankPhotoAdd(apiFacade, accessToken, alibabaphotobankphotoAlbumDomain.getAlbumID(), b);
        AlibabaproductProductImageInfo alibabaproductProductImageInfo = new AlibabaproductProductImageInfo();
        alibabaproductProductImageInfo.setImages(new String[]{ alibabaphotobankphotoResponseDomain.getUrl()});
        alibabaProductAddParam.setImage(alibabaproductProductImageInfo);


        // AlibabaproductProductImageInfo

        AlibabaProductAddResult alibabaProductAddResult = (AlibabaProductAddResult) apiFacade.alibabaTrade(alibabaProductAddParam, accessToken, AlibabaProductAddResult.class);

        System.out.println(alibabaProductAddResult.getErrorMsg());
    }

    public static AlibabaCategorySearchSPUInfoResult searchSPUInfo(ApiFacade apiFacade, String accessToken, Long categoryID) {
        AlibabaCategorySearchSPUInfoParam alibabaCategorySearchSPUInfoParam = new AlibabaCategorySearchSPUInfoParam();
        alibabaCategorySearchSPUInfoParam.setCategoryId(categoryID);
        alibabaCategorySearchSPUInfoParam.setIndex(1);
        alibabaCategorySearchSPUInfoParam.setSize(100);
        alibabaCategorySearchSPUInfoParam.setIsNeedKeyAttr(true);
        alibabaCategorySearchSPUInfoParam.setIsOnlyKeyAttr(true);
        return (AlibabaCategorySearchSPUInfoResult)apiFacade.alibabaTrade(alibabaCategorySearchSPUInfoParam, accessToken, AlibabaCategorySearchSPUInfoResult.class);
    }

    public static AlibabaCategoryAttributeGetResult CategoryAttributeGet(ApiFacade apiFacade, String accessToken, Long categoryID) {
        AlibabaCategoryAttributeGetParam alibabaCategoryAttributeGetParam = new AlibabaCategoryAttributeGetParam();
        alibabaCategoryAttributeGetParam.setCategoryID(categoryID);
        alibabaCategoryAttributeGetParam.setWebSite("1688");

        return (AlibabaCategoryAttributeGetResult)apiFacade.alibabaTrade(alibabaCategoryAttributeGetParam, accessToken, AlibabaCategoryAttributeGetResult.class);
    }

    /**
     * 上传图片
     * @param apiFacade
     */
    public static AlibabaphotobankphotoResponseDomain PhotobankPhotoAdd(ApiFacade apiFacade, String accessToken, long albumId, byte[] images) throws FileNotFoundException {
        AlibabaPhotobankPhotoAddParam alibabaPhotobankPhotoAddParam = new AlibabaPhotobankPhotoAddParam();
        alibabaPhotobankPhotoAddParam.setAlbumID(albumId);
        alibabaPhotobankPhotoAddParam.setDescription("测试图片");
        alibabaPhotobankPhotoAddParam.setName("测试图片");
        alibabaPhotobankPhotoAddParam.setWebSite("1688");
//        alibabaPhotobankPhotoAddParam.setDrawTxt(true);

        alibabaPhotobankPhotoAddParam.setImageBytes(images);

        String a = Base64.encodeBase64String(images);
        return (AlibabaphotobankphotoResponseDomain)apiFacade.alibabaTrade(alibabaPhotobankPhotoAddParam, accessToken, AlibabaphotobankphotoResponseDomain.class);
    }

    /**
     * 获取分类信息
     * @param apiFacade
     */
    public static AlibabaPhotobankAlbumGetListResult PhotobankAlbumGetList(ApiFacade apiFacade, String accessToken) {
        AlibabaPhotobankAlbumGetListParam alibabaPhotobankAlbumGetListParam = new AlibabaPhotobankAlbumGetListParam();

        alibabaPhotobankAlbumGetListParam.setWebSite("1688");
        alibabaPhotobankAlbumGetListParam.setAlbumType("MY");

        return (AlibabaPhotobankAlbumGetListResult)apiFacade.alibabaTrade(alibabaPhotobankAlbumGetListParam, accessToken, AlibabaPhotobankAlbumGetListResult.class);
    }

    /**
     * 获取分类信息
     * @param apiFacade
     */
    public static void getCatagoryInfos(ApiFacade apiFacade, String accessToken) {
        AlibabaCategoryGetParam alibabaCategoryGetParam = new AlibabaCategoryGetParam();
        alibabaCategoryGetParam.setCategoryID(0l);
        alibabaCategoryGetParam.setWebSite("1688");
        AlibabaCategoryGetResult alibabaCategoryGetResult = (AlibabaCategoryGetResult) apiFacade.alibabaTrade(alibabaCategoryGetParam, accessToken, AlibabaCategoryGetResult.class);

        System.out.println(alibabaCategoryGetResult.getErrorMsg());

        for (AlibabacategoryCategoryInfo alibabacategoryCategoryInfo :alibabaCategoryGetResult.getCategoryInfo()) {
//            System.out.println("categoryID:" + alibabacategoryCategoryInfo.getCategoryID());
            System.out.println("categoryName1:" + alibabacategoryCategoryInfo.getName());
//            System.out.println("IsLeaf:" + alibabacategoryCategoryInfo.getIsLeaf());
//            System.out.println("Level:" + alibabacategoryCategoryInfo.getLevel());
//            System.out.println("ParentIDs:" + alibabacategoryCategoryInfo.getParentIDs());

            System.out.println(searchSPUInfo(apiFacade, accessToken, alibabacategoryCategoryInfo.getCategoryID()).toString());
            for (long childId2 : alibabacategoryCategoryInfo.getChildIDs()) {
                alibabaCategoryGetParam.setCategoryID(childId2);
                alibabaCategoryGetParam.setWebSite("1688");
                AlibabaCategoryGetResult alibabaCategoryGetResult2 = (AlibabaCategoryGetResult) apiFacade.alibabaTrade(alibabaCategoryGetParam, accessToken, AlibabaCategoryGetResult.class);

                System.out.println(searchSPUInfo(apiFacade, accessToken, childId2).toString());
                for (AlibabacategoryCategoryInfo alibabacategoryCategoryInfo2 : alibabaCategoryGetResult2.getCategoryInfo()) {
                    System.out.println("categoryName2:" + alibabacategoryCategoryInfo2.getName());

                    System.out.println(searchSPUInfo(apiFacade, accessToken, alibabacategoryCategoryInfo2.getCategoryID()).toString());
                    for (long childId3 : alibabacategoryCategoryInfo2.getChildIDs()) {
                        alibabaCategoryGetParam.setCategoryID(childId3);
                        alibabaCategoryGetParam.setWebSite("1688");
                        AlibabaCategoryGetResult alibabaCategoryGetResult3 = (AlibabaCategoryGetResult) apiFacade.alibabaTrade(alibabaCategoryGetParam, accessToken, AlibabaCategoryGetResult.class);
                        System.out.println("categoryID:" + alibabaCategoryGetResult3.getCategoryInfo()[0].getCategoryID());
                        System.out.println("categoryName3:" + alibabaCategoryGetResult3.getCategoryInfo()[0].getName());
                        System.out.println("IsLeaf:" + alibabaCategoryGetResult3.getCategoryInfo()[0].getIsLeaf());
                        System.out.println("Level:" + alibabaCategoryGetResult3.getCategoryInfo()[0].getLevel());
                        System.out.println("ParentIDs:" + alibabaCategoryGetResult3.getCategoryInfo()[0].getParentIDs());
                        System.out.println(searchSPUInfo(apiFacade, accessToken, alibabaCategoryGetResult3.getCategoryInfo()[0].getCategoryID()).toString());
                        for (AlibabacategoryCategoryInfo alibabacategoryCategoryInfo4 : alibabaCategoryGetResult3.getCategoryInfo()) {
                            System.out.println("categoryName4:" + alibabacategoryCategoryInfo4.getName());

                            System.out.println(searchSPUInfo(apiFacade, accessToken, alibabacategoryCategoryInfo4.getCategoryID()).toString());
                            for (long childId5 : alibabacategoryCategoryInfo4.getChildIDs()) {
                                alibabaCategoryGetParam.setCategoryID(childId5);
                                alibabaCategoryGetParam.setWebSite("1688");
                                AlibabaCategoryGetResult alibabaCategoryGetResult5 = (AlibabaCategoryGetResult) apiFacade.alibabaTrade(alibabaCategoryGetParam, accessToken, AlibabaCategoryGetResult.class);
                                System.out.println("categoryID:" + alibabaCategoryGetResult5.getCategoryInfo()[0].getCategoryID());
                                System.out.println("categoryName4:" + alibabaCategoryGetResult5.getCategoryInfo()[0].getName());
                                System.out.println("IsLeaf:" + alibabaCategoryGetResult5.getCategoryInfo()[0].getIsLeaf());
                                System.out.println("Level:" + alibabaCategoryGetResult5.getCategoryInfo()[0].getLevel());
                                System.out.println("ParentIDs:" + alibabaCategoryGetResult5.getCategoryInfo()[0].getParentIDs());
                                System.out.println(searchSPUInfo(apiFacade, accessToken, alibabaCategoryGetResult5.getCategoryInfo()[0].getCategoryID()));
                            }
                        }
                    }
                }
            }
        }
    }
}
