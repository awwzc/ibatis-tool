package com.constants;

import java.math.BigDecimal;

public enum MysqlDataBaseEnum {
	MYSQL_VAR("varchar","String"),
	MYSQL_DATE("date","Date"),
	MYSQL_TIMESTAMP ("timestamp ","Timestamp"),
	MYSQL_DECIMAL("decimal","BigDecimal"),
	MYSQL_INT("int","Integer");
	private String tableColumnType;
	private String javaBeanPropertyType;
	private MysqlDataBaseEnum(String tableColumnType,String javaBeanPropertyType ){
		this.tableColumnType = tableColumnType;
		this.javaBeanPropertyType = javaBeanPropertyType;
	}
	
	public static String getJavaBeanPropertyType(String tableColumnType ){
		for(MysqlDataBaseEnum mysql :MysqlDataBaseEnum.values()){
			if(null!=tableColumnType&&tableColumnType.equals(mysql.tableColumnType)){
				return mysql.javaBeanPropertyType;
			}
		}
		return null;
	}
	
	public String getTableColumnType() {
		return tableColumnType;
	}
	public void setTableColumnType(String tableColumnType) {
		this.tableColumnType = tableColumnType;
	}
	public String getJavaBeanPropertyType() {
		return javaBeanPropertyType;
	}
	public void setJavaBeanPropertyType(String javaBeanPropertyType) {
		this.javaBeanPropertyType = javaBeanPropertyType;
	}
	
}
