package com.heye.controll;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.heye.Application;
import com.heye.controll.util.HttpClientHelper;
import com.heye.entity.Response;
import com.heye.entity.User;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
//@AutoConfigureMockMvc
//@TransactionConfiguration(defaultRollback=true,transactionManager="transactionManager")
//@Transactional
public class UserControlTest {

    private static final String url = "http://localhost:8080";

    @BeforeClass
    public static void beforeClass() {
//        Application.main(new String[]{});
    }

    @Test
    public void testListUser() throws Exception {
        Map<String, String> map = new HashMap<String, String>();
        map.put("userId", "");
        map.put("userName", "testUserName");
        map.put("realName", "");

        String url_value = url + "/listUser?";

        for (String key : map.keySet()) {
            if (!StringUtils.isEmpty(map.get(key))) {
                url_value += key + "=" + map.get(key) + "&";
            }
        }

        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet getRequest = new HttpGet(url_value);
        Response response = HttpClientHelper.executeToJson(httpClient, getRequest, Response.class);
        Assert.isTrue("0".equals(response.getCode()));

        List<User> list = new Gson().fromJson(response.getMessage(), new TypeToken<List<User>>() {}.getType());

        for (User d : list) {
            System.out.println(d.toString());
            Assert.notNull(d.getRealName());
            Assert.notNull(d.getUserId());
            Assert.notNull(d.getUserName());

        }

    }

    @Test
    public void testAddUser() throws Exception {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost getRequest = new HttpPost(url + "/saveUser");

        List <NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("userName", "testUserName"));
        params.add(new BasicNameValuePair("realName", "testRealName"));

        getRequest.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));

        Response response = HttpClientHelper.executeToJson(httpClient, getRequest, Response.class);
        Assert.isTrue("0".equals(response.getCode()));
    }


    @Test
    public void testUpdateUser() throws Exception {
        String userId = "f254998b-b58f-496c-af32-c23f830f8342";
        String userName = "testUserName1";
        String realName = "testRealName1";

        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet getRequest = new HttpGet(url + "/updateUser?userId=" + userId + "&userName=" + userName + "&realName=" + realName);

        Response response = HttpClientHelper.executeToJson(httpClient, getRequest, Response.class);
        Assert.notNull(response);
        Assert.isTrue("0".equals(response.getCode()));

    }

    @Test
    public void testDeleteUser() throws Exception {
        String userId = "afdb1e43-e742-4cc4-8f6f-97a02d37d350";

        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet getRequest = new HttpGet(url + "/deleteUser?userId=" + userId);

        Response response = HttpClientHelper.executeToJson(httpClient, getRequest, Response.class);
        Assert.notNull(response);
        Assert.isTrue("0".equals(response.getCode()));
    }
}

