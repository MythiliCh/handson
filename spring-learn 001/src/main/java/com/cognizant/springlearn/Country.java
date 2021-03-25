package com.cognizant.springlearn;

import org.slf4j.LoggerFactory;

import org.slf4j.Logger;

public class Country {
	

	private String name;
	private String code;
	Logger logger= LoggerFactory.getLogger(Country.class);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", code=" + code + "]";
	}
	
}
