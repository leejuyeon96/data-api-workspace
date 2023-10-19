package com.kh.opendata.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class APIController {
	
	public static final String serviceKey = "6eKt47nwk1LQ1ZnZa3PvX39sHM1UuX5SYAmOyaIMYeZoK1%2F%2FMd1nulFnEcOGOVmCEZKwcm203fM0l%2BhfIXBJSA%3D%3D";
	@ResponseBody
	@RequestMapping(value="api.do", produces="application/json; charset=utf-8")
	public String apiInfo() throws IOException {
	
		String url = "https://apis.data.go.kr/1543061/animalShelterSrvc/shelterInfo";
	
		url += "?serviceKey=" + serviceKey;	// 파라미터값 받아올 때 무조건 ?부터니까
		
		URL requestUrl = new URL(url);
		HttpURLConnection urlConnection = (HttpURLConnection) requestUrl.openConnection();
		urlConnection.setRequestMethod("GET");	// 지금 GET방식으로 가지고 오고 있으므로
		
		BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		String line = null;
		
		StringBuffer responseBuffer = new StringBuffer();
		
		while((line = br.readLine()) != null) {	// br에 있는 거 한 줄씩 읽어와서 null이 아닐 때까지
//			System.out.println(line);
			responseBuffer.append(line);
		}
		br.close();
		urlConnection.disconnect();
		
		
		return null;
	}
}
