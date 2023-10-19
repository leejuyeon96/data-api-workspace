package com.kh.opendata.run;

import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URLEncoder;

public class AirPollutionJavaApp {

	public static final String serviceKey = "UNmnLkcNtzgMKivBzvyb3TdrsqmthwquJWOHYpkKXK6aXtSdhG1gbTQ6EOqATL5t3ApCJ2hySkej4pCTXuaAZg%3D%3D\r\n";
			
	public static void main(String[] args) {
		String url = "http://apis.data.go.kr/dfdfd";
		url += "?serviceKey=" + "서비스키";//서비스키 적어야함  
		url += "&sidoName=" + URLEncoder.encode("서울", "UTF-8");
		url += "&returnType=json";
		
		URL requestUrl = new URL(url);
		HttpURLConnection httpURLConnection = new HttpURLConnection(null);
		httpURLConnection.setRequestMethod("GET");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		String line = null;
		while((line = br.readLine()))
	}

}
