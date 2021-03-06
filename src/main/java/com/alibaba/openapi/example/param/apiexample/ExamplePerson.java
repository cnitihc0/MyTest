package com.alibaba.openapi.example.param.apiexample;

import java.util.Date;

public class ExamplePerson {

	private String name;

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置 * 参数示例：
	 * 
	 * <pre></pre>
	 * 
	 * 此参数必填
	 */
	public void setName(String name) {
		this.name = name;
	}

	private Integer age;

	/**
	 * @return
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * 设置 * 参数示例：
	 * 
	 * <pre></pre>
	 * 
	 * 此参数必填
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	private Date birthday;

	/**
	 * @return
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * 设置 * 参数示例：
	 * 
	 * <pre></pre>
	 * 
	 * 此参数必填
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	private String mobileNumber;

	/**
	 * @return
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * 设置 * 参数示例：
	 * 
	 * <pre></pre>
	 * 
	 * 此参数必填
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
