package com.sts.api.runnerClass;

import java.io.IOException;


import org.testng.annotations.Test;


import com.sts.api.testcases.TestCases;


public class ApiRunner {
	TestCases testCase;
	public ApiRunner() throws IOException, InterruptedException {
		
		testCase = new TestCases();
	}
	@Test
	public void OrderPetRunner() throws Exception {
	  
		
		testCase.test();;
		
		
		
	}

}
