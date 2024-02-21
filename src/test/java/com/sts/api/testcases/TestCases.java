package com.sts.api.testcases;

import java.util.HashMap;
import java.util.Map;

import com.sts.api.payloads.Payloads;

import APIHelpers.ApiHelper;





public class TestCases {

	ApiHelper apiHelper;
    private static Map<String, String> Headers = new HashMap<>();
    private final String propertyFilePath = "configs/config.properties";
	
	public TestCases() {
		// TODO Auto-generated constructor stub
		 apiHelper = new ApiHelper();
	}
	
	public void PlaceOrder() throws Exception  {
		 String filePath = "Data.xlsx";
	     String sheetName = "Data";
	     String baseUrl = "https://petstore.swagger.io";
	     String endpoint = "/v2/store/order";
	     
	     setupHeaders() ;
	     apiHelper.ParametizePayloadAndSendPostRequest(
	    		 Payloads.getPetPayload(), 
	    		 filePath, 
	    		 sheetName,  
	    		 baseUrl,  
	    		 endpoint, 
	    		 Headers,"", "");
	}
	
	public void setupHeaders() {
		 Headers.put("Content-Type", "application/xml");
	}

}
