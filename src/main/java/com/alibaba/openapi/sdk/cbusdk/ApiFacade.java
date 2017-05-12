package com.alibaba.openapi.sdk.cbusdk;

import com.alibaba.openapi.client.*;
import com.alibaba.openapi.client.entity.AuthorizationToken;
import com.alibaba.openapi.client.entity.AuthorizationTokenStore;
import com.alibaba.openapi.client.entity.DefaultAuthorizationTokenStore;
import com.alibaba.openapi.client.policy.ClientPolicy;
import com.alibaba.openapi.client.policy.RequestPolicy;
import com.alibaba.openapi.client.policy.RequestPolicy.HttpMethodPolicy;
import com.alibaba.openapi.client.serialize.DeSerializerListener;
import com.alibaba.openapi.client.serialize.SerializerListener;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaBaseParam;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaBaseResult;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaTradeGetSellerOrderListParam;
import com.alibaba.openapi.sdk.cbusdk.param.AlibabaTradeGetSellerOrderListResult;

import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ApiFacade implements OceanApiFacadeInterface, SDKListener {
    private String serverHost = "gw.api.alibaba.com";
    private int httpPort = 80;
    private int httpsPort = 443;
    private String appKey;
    private String secKey;
    private AuthorizationTokenStore authorizationTokenStore;
    private Map<Class<? extends SerializerListener>, SerializerListener> serializerListeners = new LinkedHashMap();
    private Map<Class<? extends DeSerializerListener>, DeSerializerListener> deSerializerListeners = new LinkedHashMap();

    public ApiFacade() {
    }

    public void register(SerializerListener serializerListener) {
        this.serializerListeners.put(serializerListener.getClass(), serializerListener);
    }

    public void register(DeSerializerListener deSerializerListener) {
        this.deSerializerListeners.put(deSerializerListener.getClass(), deSerializerListener);
    }

    public SyncAPIClient getAPIClient() {
        ClientPolicy clientPolicy = new ClientPolicy(this.serverHost);
        clientPolicy.setHttpPort(Integer.valueOf(this.httpPort));
        clientPolicy.setHttpsPort(Integer.valueOf(this.httpsPort));
        if(this.appKey != null) {
            clientPolicy.setAppKey(this.appKey);
        }

        if(this.secKey != null) {
            clientPolicy.setSigningKey(this.secKey);
        }

        if(this.authorizationTokenStore == null) {
            this.authorizationTokenStore = new DefaultAuthorizationTokenStore();
        }

        SyncAPIClient syncAPIClient = (new AlibabaClientFactory()).createAPIClient(clientPolicy, this.authorizationTokenStore);
        return syncAPIClient;
    }

    public final void setServerHost(String host) {
        this.serverHost = host;
    }

    public final void setHttpPort(int port) {
        this.httpPort = port;
    }

    public final void setHttpsPort(int port) {
        this.httpsPort = port;
    }

    public final void setAppKey(String newAppKey) {
        this.appKey = newAppKey;
    }

    public final void setSigningKey(String newSecKey) {
        this.secKey = newSecKey;
    }

    public final AuthorizationToken getToken(String code) {
        try {
            return this.getAPIClient().getToken(code);
        } catch (Exception var3) {
            throw new RuntimeException(var3);
        }
    }

    public final AuthorizationToken refreshToken(String refreshToken) {
        try {
            return this.getAPIClient().refreshToken(refreshToken);
        } catch (Exception var3) {
            throw new RuntimeException(var3);
        }
    }

    public final AlibabaTradeGetSellerOrderListResult alibabaTradeGetSellerOrderList(AlibabaTradeGetSellerOrderListParam param, String accessToken) {
        new SimpleDateFormat("yyyyMMddHHmmssSSSZ");
        RequestPolicy reqPolicy = new RequestPolicy();
        reqPolicy.setHttpMethod(HttpMethodPolicy.POST).setNeedAuthorization(true).setRequestSendTimestamp(false).setUseHttps(false).setUseSignture(true).setAccessPrivateApi(false);

        try {
            Request req = new Request("com.alibaba.trade", "alibaba.trade.getSellerOrderList", 1);
            req.setRequestEntity(param);
            req.setAccessToken(accessToken);
            AlibabaTradeGetSellerOrderListResult ret = (AlibabaTradeGetSellerOrderListResult)this.getAPIClient().send(req, AlibabaTradeGetSellerOrderListResult.class, reqPolicy, this.serializerListeners.values(), this.deSerializerListeners.values());
            return ret;
        } catch (Exception var7) {
            throw new RuntimeException(var7);
        }
    }

    public AlibabaBaseResult alibabaTrade(AlibabaBaseParam param, String accessToken, Class<? extends AlibabaBaseResult> ResultClass) {
        RequestPolicy reqPolicy = new RequestPolicy();
        reqPolicy.setHttpMethod(HttpMethodPolicy.POST).setNeedAuthorization(true).setRequestSendTimestamp(false).setUseHttps(false).setUseSignture(true).setAccessPrivateApi(false);

        try {
            Request req = new Request(param.getApiNamespace(), param.getApiName(), param.getApiVersion());
            req.setRequestEntity(param);
            req.setAccessToken(accessToken);
            return this.getAPIClient().send(req, ResultClass, reqPolicy, this.serializerListeners.values(), this.deSerializerListeners.values());
        } catch (Exception var7) {
            throw new RuntimeException(var7);
        }
    }
}
