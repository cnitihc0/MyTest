package com.heye.controll.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;

public class HttpClientHelper {
    private static final Logger LOGGER = LoggerFactory.getLogger(HttpClientHelper.class);

    private static final String sqbh = "YT001";
    private static final String sqmy = "46B51ABABDF3A77DAA2E3D27B3AF4FFA";

    public static CloseableHttpResponse execute(CloseableHttpClient httpClient, HttpUriRequest request) throws IOException {
        final String uri = request.getURI().toString();

        LOGGER.info("request: {} {}", request.getMethod(), request.getURI());

        return httpClient.execute(request);
    }

    public static <T> T executeToJson(CloseableHttpClient httpClient, HttpUriRequest request, Class<T> clazz) throws IOException {
        CloseableHttpResponse response = execute(httpClient, request);
        String responseString = readToString(response.getEntity().getContent());

        LOGGER.info("response: {} {}", response.getStatusLine().getStatusCode(), responseString);

        if (response.getStatusLine().getStatusCode() == 200) {
            return new GsonBuilder().setDateFormat("yyyyMMddHHmmss").create().fromJson(responseString, clazz);
        } else {
            throw new RuntimeException("Failed : code : " + response.getStatusLine().getStatusCode() + " msg: ");
        }
    }

    public static <T> T executeToJson(CloseableHttpClient httpClient, HttpUriRequest request, Type type) throws IOException {
        CloseableHttpResponse response = execute(httpClient, request);
        String responseString = readToString(response.getEntity().getContent());

        LOGGER.info("response: {} {}", response.getStatusLine().getStatusCode(), responseString);

        if (response.getStatusLine().getStatusCode() == 200) {
            return new Gson().fromJson(responseString, type);
        } else {
            throw new RuntimeException("Failed : code : " + response.getStatusLine().getStatusCode() + " msg: ");
        }
    }

    static String formatURI(String uri) {
        if (uri.indexOf("//") != -1)
            uri = uri.substring(uri.indexOf("//") + 2);

        int beginIndex = uri.indexOf("/");
        int endIndex = uri.indexOf("?");

        if (beginIndex <= 0)
            beginIndex = 0;
        if (endIndex >= uri.length())
            endIndex = uri.length();

        return uri.substring(beginIndex, endIndex);
    }

    static String readToString(InputStream input) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(input));

        StringBuilder builder = new StringBuilder();
        do {
            String line = br.readLine();

            if (line == null)
                break;

            builder.append(line);
        } while (true);

        return builder.toString();
    }

}
