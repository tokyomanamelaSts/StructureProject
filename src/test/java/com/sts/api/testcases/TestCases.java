package com.sts.api.testcases;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.sts.api.payloads.Payloads;

import APIHelpers.ApiHelper;
import Report.ExtentTestManager;





public class TestCases {

	ApiHelper apiHelper;
    private static Map<String, String> Headers = new HashMap<>();
    private final String propertyFilePath = "configs/config.properties";
	
	public TestCases() throws IOException, InterruptedException {
		// TODO Auto-generated constructor stub
		 apiHelper = new ApiHelper();
	}
	
	public void PlaceOrder() throws Exception  {
		 String filePath = "Data.xlsx";
	     String sheetName = "Data";
	     String baseUrl = "https://petstore.swagger.io";
	     String endpoint = "/v2/store/order";
	     
	     setupHeaders() ;
	     apiHelper  .ParametizePayloadAndSendPostRequest(
	    		 Payloads.getPetPayload(), 
	    		 filePath, 
	    		 sheetName,  
	    		 baseUrl,  
	    		 endpoint, 
	    		 Headers,"", "");
	}
	
	
	public void test() throws IOException {
		String filePath = "Data.xlsx";
	     String sheetName = "Data";
	     String baseUrl = "https://petstore.swagger.io";
	     String endpoint = "/v2/store/order";
         ExtentTestManager.startTest("Test");
	     
	     setupHeaders();
	     String body = "{\n"
	     		+ "  \"id\": 0,\n"
	     		+ "  \"petId\": 0,\n"
	     		+ "  \"quantity\": 0,\n"
	     		+ "  \"shipDate\": \"2024-02-13T07:35:19.910Z\",\n"
	     		+ "  \"status\": \"placed\",\n"
	     		+ "  \"complete\": true\n"
	     		+ "}";
		
		apiHelper.sendRestPostRequest(baseUrl, body, endpoint, Headers, "", "");
	}
	
	public void setupHeaders() {
		 Headers.put("Content-Type", "application/json");
	}

}
