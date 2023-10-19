package com.kh.opendata.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class ApiController2 {
	
	public static final String serviceKey = "";
	
	@ResponseBody
	@RequestMapping(value="api.do", produces="application/json; charset=utf-8")
	public String apiInfo(String stnId) throws IOException {
		
		String url = "https://apis.data.";
		
		url += "?serviceKey=" + serviceKey;
		url += "&tmFc";
		url += "dataType=JSON";
		url += "&stnId=" + stnId;
		
		URL requestUrl = new URL(url);
		HttpURLConnection urlConnection = (HttpURLConnection) requestUrl.openConnection();
		urlConnection.setRequestMethod("GET");
		
		BufferedReader br = new BufferedReader (new InputStreamReader(urlConnection.getInputStream()));
		String line = null;
		
		StringBuffer responseBuffer = new StringBuffer();
		
		while((line = br.readLine()) != null) {
			responseBuffer.append(line);
		}
		br.close();
		urlConnection.disconnect();
		
		return null;
		

	}

}
