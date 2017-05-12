/**
 * 
 */
package com.alibaba.openapi.client;

import com.alibaba.openapi.client.serialize.DeSerializerListener;
import com.alibaba.openapi.client.serialize.SerializerListener;

/**
 * @author hongbang.hb
 *
 */
public interface SDKListener {
	
	public void register(SerializerListener serializerListener);

	public void register(DeSerializerListener deSerializerListener);
	
}
