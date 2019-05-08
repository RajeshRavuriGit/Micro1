package com.example.Client1;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="some")
public class TestConfig {
/*
	 public Map<String, String> getMyMap() {
		return one;
	}

	public void setMyMap(Map<String, String> myMap) {
		this.one = myMap;
	}

	private Map<String, String> one = new HashMap<>();
	
	*/public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	private String property;
	
}
