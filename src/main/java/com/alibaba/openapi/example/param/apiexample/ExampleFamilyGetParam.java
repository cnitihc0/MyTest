package com.alibaba.openapi.example.param.apiexample;



public class ExampleFamilyGetParam {

        	
    private Integer familyNumber;
    
        /**
       * @return 可接受参数1或者2，其余参数无法找到family对象
    */
        public Integer getFamilyNumber() {
        return familyNumber;
    }
    
    /**
     * 设置可接受参数1或者2，其余参数无法找到family对象     *
     * 参数示例：<pre></pre>     
             * 此参数必填
          */
    public void setFamilyNumber(Integer familyNumber) {
        this.familyNumber = familyNumber;
    }
    
    
    private ExampleFamily[] myTest;

	public ExampleFamily[] getMyTest() {
		return myTest;
	}

	public void setMyTest(ExampleFamily[] myTest) {
		this.myTest = myTest;
	}
    
    
    
    


}
