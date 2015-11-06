package com.bean;

import java.util.List;
import java.util.Set;

public class JavaDtoCLassBean  extends JavaBaseClassBean{
	
	private List<TableColumnsMappingJavaPropertyBean> tableColumnsMappingJavaPropertyBeans;
	private String dataBase;
	public String getDataBase() {
		return dataBase;
	}
	public void setDataBase(String dataBase) {
		this.dataBase = dataBase;
	}
	public List<TableColumnsMappingJavaPropertyBean> getTableColumnsMappingJavaPropertyBeans() {
		return tableColumnsMappingJavaPropertyBeans;
	}
	public void setTableColumnsMappingJavaPropertyBeans(
			List<TableColumnsMappingJavaPropertyBean> tableColumnsMappingJavaPropertyBeans) {
		this.tableColumnsMappingJavaPropertyBeans = tableColumnsMappingJavaPropertyBeans;
	}
	
	
}
