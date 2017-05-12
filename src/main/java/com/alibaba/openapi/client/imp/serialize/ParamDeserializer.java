/**
 * 
 */
package com.alibaba.openapi.client.imp.serialize;

import com.alibaba.openapi.client.policy.Protocol;

/**
 * @author hongbang.hb
 *
 */
public class ParamDeserializer extends JsonDeserializer {

	@Override
	public String supportedContentType() {
		return Protocol.param.name();
	}

}
