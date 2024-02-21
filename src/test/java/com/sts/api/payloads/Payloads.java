package com.sts.api.payloads;

public class Payloads {

	public Payloads() {
		// TODO Auto-generated constructor stub
	}
	
	public static  String getPetPayload() {
		
		return "{\n"
				+ "  \"id\": 0,\n"
				+ "  \"petId\": 0,\n"
				+ "  \"quantity\": 0,\n"
				+ "  \"shipDate\": \"2024-02-13T07:35:19.910Z\",\n"
				+ "  \"status\": \"placed\",\n"
				+ "  \"complete\": true\n"
				+ "}";
	}

}
