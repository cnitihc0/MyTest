package com.alibaba.openapi.client.util;

import java.io.IOException;
import java.util.Map;

import com.alibaba.openapi.client.exception.AuthServiceException;
import com.alibaba.openapi.client.exception.InvokeConnectException;
import com.alibaba.openapi.client.exception.InvokeTimeoutException;
import com.alibaba.openapi.client.exception.OceanException;
import com.alibaba.openapi.client.exception.SecurityException;
import com.alibaba.openapi.client.exception.UnsupportAPIException;
import com.alibaba.openapi.util.GenericsUtil;

/**
 * Build <code>Exception</code> for all kinds of
 * {@link com.alibaba.openapi.client.policy.Protocol}, base on the exption
 * string which got from <code>Reader</code>
 * 
 * @author xiaoning.qxn
 */
public class ExceptionParser {

	/**
	 * for Protocol.Json2
	 * 
	 * @param exption
	 * @return the new exception
	 * @throws JsonMappingException
	 * @throws JsonParseException
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public static Throwable buildException4Json2(Map exption) {
		Map<String, Object> m = exption;

		String errorCodeStr = (String) m.get("error_code");
		String errorMesage = (String) m.get("error_message");
		// if null ,then just return the result
		if (GenericsUtil.isBlank(errorMesage)) {
			errorMesage = "Unknow message defined in response.";
		}
		if (GenericsUtil.isBlank(errorCodeStr) || !GenericsUtil.isNumeric(errorCodeStr)) {
			return buildException(errorCodeStr, errorMesage);
		} else {
			int errorCode = Integer.parseInt(errorCodeStr);
			return buildException(errorCode, errorMesage);
		}
	}

	@SuppressWarnings("unchecked")
	public static Throwable buildException4OAuth2(Object exption) {
		Map<String, Object> m = (Map<String, Object>) exption;
		int errorCode = 401;
		String errorMesage = (String) m.get("error_description");
		return buildException(errorCode, errorMesage);
	}

	private static Throwable buildException(int errorCode, String errorMesage) {

		switch (errorCode) {
		case 400:
			return new SecurityException(errorMesage);
		case 401:
			return new AuthServiceException(errorMesage);
		case 404:
			return new UnsupportAPIException(errorMesage);
		case 502:
			return new InvokeConnectException(errorMesage);
		case 504:
			return new InvokeTimeoutException(errorMesage);
		}
		return new OceanException(String.valueOf(errorCode), errorMesage);
	}

	private static Throwable buildException(String errorCode, String errorMesage) {
		return new OceanException(errorCode, errorMesage);
	}
}
