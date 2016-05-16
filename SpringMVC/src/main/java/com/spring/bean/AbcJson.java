package com.spring.bean;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonGenerator;

public class AbcJson {

	private String b;
	private String a;
	private String c;

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "AbcJson [b=" + b + ", a=" + a + ", c=" + c + "]";
	}

	public static void main(String[] args) {

		Map<String, Object> map = new HashMap<String, Object>();

		map.put("name", 1);

		map.put("account", 2);

	}

}
