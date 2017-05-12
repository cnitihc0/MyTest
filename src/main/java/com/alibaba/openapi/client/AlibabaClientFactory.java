/**
 * 
 */
package com.alibaba.openapi.client;

import com.alibaba.openapi.client.entity.AuthorizationTokenStore;
import com.alibaba.openapi.client.imp.serialize.HttpRequestSerializer;
import com.alibaba.openapi.client.imp.serialize.Json2Deserializer;
import com.alibaba.openapi.client.imp.serialize.JsonDeserializer;
import com.alibaba.openapi.client.imp.serialize.Param2Deserializer;
import com.alibaba.openapi.client.imp.serialize.Param2RequestSerializer;
import com.alibaba.openapi.client.imp.serialize.ParamDeserializer;
import com.alibaba.openapi.client.imp.serialize.ParamRequestSerializer;
import com.alibaba.openapi.client.imp.serialize.Xml2Deserializer;
import com.alibaba.openapi.client.policy.ClientPolicy;
import com.alibaba.openapi.client.serialize.SerializerProvider;

/**
 * @author hongbang.hb
 *
 */
public class AlibabaClientFactory {

	protected SerializerProvider initSerializerProvider() {
		SerializerProvider serializerProvider = new SerializerProvider();
		serializerProvider.register(new Xml2Deserializer());
		serializerProvider.register(new JsonDeserializer());
		serializerProvider.register(new Json2Deserializer());
		serializerProvider.register(new ParamDeserializer());
		serializerProvider.register(new Param2Deserializer());

		serializerProvider.register(new HttpRequestSerializer());
		serializerProvider.register(new ParamRequestSerializer());
		serializerProvider.register(new Param2RequestSerializer());
		return serializerProvider;
	}

	public SyncAPIClient createAPIClient(ClientPolicy policy, AuthorizationTokenStore authorizationTokenStore) {

		SerializerProvider serializerProvider = initSerializerProvider();

		final SyncAPIClient syncAPIClient = new SyncAPIClient(policy, serializerProvider, authorizationTokenStore);
		syncAPIClient.start();
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				if (syncAPIClient != null) {
					syncAPIClient.shutdown();
				}
			}
		});
		return syncAPIClient;
	}
}
