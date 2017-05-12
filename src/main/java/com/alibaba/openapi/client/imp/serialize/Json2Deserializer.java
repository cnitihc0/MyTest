/**
 * Project: ocean.client.java.basic
 *
 * File Created at 2011-10-27
 * $Id: Json2HttpResponseParser.java 311300 2013-12-23 06:15:28Z yichun.wangyc $
 *
 * Copyright 2008 Alibaba.com Croporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
package com.alibaba.openapi.client.imp.serialize;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.openapi.client.entity.ResponseWrapper;
import com.alibaba.openapi.client.policy.Protocol;
import com.alibaba.openapi.client.serialize.DeSerializerListener;
import com.alibaba.openapi.client.serialize.SerializerListener;
import com.alibaba.openapi.client.util.ExceptionParser;

/**
 * 
 * @author hongbang.hb
 *
 */
public class Json2Deserializer extends AbstractJsonDeserializer {

	private Map<Class<? extends DeSerializerListener>, DeSerializerListener> listnerList = new LinkedHashMap<Class<? extends DeSerializerListener>, DeSerializerListener>();

	public String supportedContentType() {
		return Protocol.json2.name();
	}

	@Override
	public <T> ResponseWrapper<T> deSerialize(String content, Class<T> resultType) {
		for (DeSerializerListener deSerializerListener : listnerList.values()) {
			deSerializerListener.onResponseDeSerialized(content);
		}
		JSONObject json = JSON.parseObject(content);
		T result = this.parseResult(json, resultType);
		ResponseWrapper<T> responseWrapper = new ResponseWrapper<T>();
		responseWrapper.setResult(result);
		return responseWrapper;
	}

	@Override
	public Throwable buildException(String content, int statusCode) {
		for (DeSerializerListener deSerializerListener : listnerList.values()) {
			deSerializerListener.onResponseExceptioned(content);
		}
		Map result = JSON.parseObject(content, Map.class);
		return ExceptionParser.buildException4Json2(result);
	}

	public void registeDeSerializerListener(DeSerializerListener listner) {
		if (!listnerList.containsKey(listner.getClass())) {
			listnerList.put(listner.getClass(), listner);
		}
	}

}
