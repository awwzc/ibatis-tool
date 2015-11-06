package com.constants;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;



public enum JavaPropertyTypeAndFullNameEnum {
	
	INTEGER("Integer","java.lang.Integer"),
	LONG("Long","java.lang.Long"),
	DATE("Date","java.sql.Date"),
	TIMESTAMP("Timestamp","java.sql.Timestamp"),
	STRING("String","java.lang.String"),
	BIGDECIMAL("BigDecimal","java.math.BigDecimal");
	
	private String javaPropertyType;
	private String javaBeanPropertyTypeFullName;
	
	private JavaPropertyTypeAndFullNameEnum(String javaPropertyType,String javaBeanPropertyTypeFullName ){
		this.javaPropertyType = javaPropertyType;
		this.javaBeanPropertyTypeFullName = javaBeanPropertyTypeFullName;
	}
	public static String getJavaBeanPropertyTypeFullName(String javaPropertyType){
		for(JavaPropertyTypeAndFullNameEnum jptfn :JavaPropertyTypeAndFullNameEnum.values()){
			if(null!=javaPropertyType&&javaPropertyType.equals(jptfn.javaPropertyType)){
				return jptfn.javaBeanPropertyTypeFullName;
			}
		}
		return null;
	}
	public String getJavaPropertyType() {
		return javaPropertyType;
	}
	public void setJavaPropertyType(String javaPropertyType) {
		this.javaPropertyType = javaPropertyType;
	}
	public void setJavaBeanPropertyTypeFullName(String javaBeanPropertyTypeFullName) {
		this.javaBeanPropertyTypeFullName = javaBeanPropertyTypeFullName;
	}
	
	
}
