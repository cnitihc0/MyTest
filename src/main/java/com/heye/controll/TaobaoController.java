package com.heye.controll;

import com.alibaba.openapi.client.entity.AuthorizationToken;
import com.alibaba.openapi.sdk.cbusdk.ApiFacade;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaCategoryGetParam;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaCategoryGetResult;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabacategoryCategoryInfo;
import com.alibaba.openapi.util.SignatureUtil;
import com.alibaba.openapi.util.StringUtil;
import com.taobao.ItempropsGetRequest;
import com.taobao.ItempropsGetResponse;
import com.taobao.api.ApiException;
import com.taobao.api.Constants;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.request.AlibabaOpenIbankProfileGetRequest;
import com.taobao.api.response.AlibabaOpenIbankProfileGetResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2017/4/25.
 */
@RestController
public class TaobaoController {
    String client_id = "23811910";
    String secKey = "07badcd8752fb09b951632bf2bbb52fe";
    String site = "china";
    String authorizeUrl_product = "https://oauth.taobao.com/authorize";
    String authorizeUrl_tbsandbox = "https://oauth.tbsandbox.com/authorize";
    String apiUrl_product = "http://gw.api.taobao.com/router/rest";
    String apiUrl_tbsandbox = "http://gw.api.tbsandbox.com/router/rest";
    String tokenUrl_tbsandbox = "https://oauth.tbsandbox.com/authorize";
    String tokenUrl_product = "https://oauth.taobao.com/token";
    String redirect_uri = "http://119.23.24.181";

    @RequestMapping(method = RequestMethod.GET, value="/taobaoSQ")
    public void adliSQ(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String url =authorizeUrl_product + "?client_id=" + client_id + "&state=1212&response_type=token&redirect_uri="+redirect_uri+"&view=web";
        response.sendRedirect(url);
    }

    @RequestMapping(method = RequestMethod.GET, value="/getTaobaoSQCode")
    public void getAdliSQCode(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String params = "access_token=61024287973d23fa70a8846d7584fe0557b41f081c869dd3242276624&token_type=Bearer&expires_in=86400&refresh_token=6101e288103deb615fdd8ad6979591f8b5ab1bf9f4d6a593242276624&re_expires_in=86400&r1_expires_in=86400&r2_expires_in=86400&taobao_user_id=3242276624&taobao_user_nick=%E5%A4%A7%E8%B1%A1%E5%9F%8E%E5%88%9B%E4%B8%9A%E6%9C%8D%E5%8A%A1%E4%B8%AD%E5%BF%83&w1_expires_in=86400&w2_expires_in=86400&state=1212&top_sign=96E2C44943383480CE06B35A453A54BE";
        Map<String, String> map = new HashMap<String, String>();
        for (String v : params.split("&")) {
            map.put("", "");
        }

        //        TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
//        client.execute(req, sessionKey);
//        System.out.println(rsp.getBody());
    }

    public static void main(String[] args) throws IOException, ApiException {
        TaobaoController c = new TaobaoController();

        String params = "access_token=61020274061a9fd074d281a5cb29b73db771caa6cff17f03242276624&token_type=Bearer&expires_in=86400&refresh_token=6100827c2a3df3fd9b997ed6d29ec734a2714a09a7135be3242276624&re_expires_in=86400&r1_expires_in=86400&r2_expires_in=86400&taobao_user_id=3242276624&taobao_user_nick=%E5%A4%A7%E8%B1%A1%E5%9F%8E%E5%88%9B%E4%B8%9A%E6%9C%8D%E5%8A%A1%E4%B8%AD%E5%BF%83&w1_expires_in=86400&w2_expires_in=86400&state=1212&top_sign=2EFC4CCFB8F398F62E40BC374978259D";
        Map<String, String> map = new HashMap<String, String>();
        String top_sign = "";
        for (String v : params.split("&")) {
            String key = v.split("=")[0];
            String value = v.split("=")[1];
            if ("top_sign".equals(key)) {
                System.out.println("top_sign=" + value);
                top_sign = value;
                continue;
            }
            map.put(key, value);
        }
        String sign = TaobaoUtils.signTopRequest(map, null, c.secKey, Constants.SIGN_METHOD_MD5);
        System.out.println("sign=" + sign);
        System.out.println(sign.equals(top_sign));

//        TaobaoClient client = new DefaultTaobaoClient(c.apiUrl_product, c.client_id, c.secKey);
//        AlibabaOpenIbankProfileGetRequest req = new AlibabaOpenIbankProfileGetRequest();
//        req.setUnused("unused");
//        AlibabaOpenIbankProfileGetResponse rsp = client.execute(req, map.get("access_token"));
//        System.out.println(rsp.getBody());


        TaobaoClient client = new DefaultTaobaoClient(c.apiUrl_product, c.client_id, c.secKey);
        ItempropsGetRequest req = new ItempropsGetRequest();
//        req.setFields("pid,name,must,multi,prop_values");
        req.setCid(122532002L);
//        req.setPid(3232L);
//        req.setParentPid(4834L);
//        req.setIsKeyProp(true);
//        req.setIsSaleProp(true);
//        req.setIsColorProp(true);
//        req.setIsEnumProp(true);
//        req.setIsInputProp(true);
//        req.setIsItemProp(true);
//        req.setDatetime(StringUtils.parseDateTime("2010-01-01 00:00:00"));
//        req.setChildPath("3932:13221;2113:2345");
//        req.setType(1L);
//        req.setAttrKeys("");
        ItempropsGetResponse rsp = client.execute(req);
        System.out.println(rsp.getBody());


    }

}
