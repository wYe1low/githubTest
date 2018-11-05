package com.study.test;

import java.nio.charset.StandardCharsets;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.study.model.Mobile;

public class RestTemplateTest {
	public static String url ="http://localhost:8080/MobileSearch/service/mobile";
	public static void main(String[] args) {
		RestTemplate rest = new RestTemplate();
		rest.getMessageConverters().set(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));
		
		Mobile mobile = rest.getForObject(url+"/get/18511589657", Mobile.class);
		System.out.println("get:"+mobile);
	}
}
