/**
 * 
 */
package com.alibaba.openapi.client;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import com.alibaba.openapi.client.entity.AuthorizationToken;
import com.alibaba.openapi.client.exception.OceanException;
import com.alibaba.openapi.client.policy.RequestPolicy;

/**
 * @author hongbang.hb
 *
 */
public interface APIClient {

	/**
	 * 发起API访问
	 * 
	 * @param request
	 *            Request
	 * @param resultType
	 *            返回结果类型，可为null
	 * @param policy
	 *            请求级策略
	 * @return 返回自定义类型的结果
	 * @throws InterruptedException
	 * @throws ExecutionException
	 * @throws TimeoutException
	 */
	public <T> T send(Request request, Class<T> resultType, RequestPolicy policy) throws OceanException;

	/**
	 * 使用临时code换取用户授权的access_token 以及refresh_token
	 * 
	 * <pre>
	 * 使用默认的全局RequestPolicy.getAuthPolicy(),默认超时为5s，
	 * 如果报发送请求超时，自行设置:
	 * 1 设置授权全局的超时时间
	 *  RequestPolicy.getAuthPolicy().setTimeout(100000);
	 * 2 @see getToken(String code,int timeout)
	 * </pre>
	 * 
	 * @param code
	 *            临时code
	 * @return 用户授权信息
	 */
	public AuthorizationToken getToken(String code) throws OceanException;

	/**
	 * 使用用户的refresh_token 换取access_token
	 * 
	 * <pre>
	 * 使用默认的全局RequestPolicy.getAuthPolicy(),默认超时为5s，
	 * 如果报发送请求超时，自行设置:
	 * 1 设置授权全局的超时时间
	 *  RequestPolicy.getAuthPolicy().setTimeout(100000);
	 * 2 @see refreshToken(String refreshToken,int timeout)
	 * </pre>
	 * 
	 * @param refreshToken
	 * @return 用户授权信息
	 */
	public AuthorizationToken refreshToken(String refreshToken) throws OceanException;
	
	
	/**
	 * 启动AlibabaClient实例
	 */
	public void start();

	/**
	 * 关闭AlibabaClient实例
	 */
	public void shutdown();


}
