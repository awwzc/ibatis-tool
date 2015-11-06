package com.bean;

import java.util.List;
import java.util.Set;

public class javaDtoCLassBean {
	private String javaPackage;
	private String  createPath;
	private String  name;
	private String author;
	private String superClass;
	private List<TableColumnsMappingJavaPropertyBean> tableColumnsMappingJavaPropertyBeans;
	private String dataBase;
	
	private Set<String> importJavas;
	
	
	public Set<String> getImportJavas() {
		return importJavas;
	}
	public void setImportJavas(Set<String> importJavas) {
		this.importJavas = importJavas;
	}
	public String getDataBase() {
		return dataBase;
	}
	public void setDataBase(String dataBase) {
		this.dataBase = dataBase;
	}
	public String getSuperClass() {
		return superClass;
	}
	public void setSuperClass(String superClass) {
		this.superClass = superClass;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJavaPackage() {
		return javaPackage;
	}
	public void setJavaPackage(String javaPackage) {
		this.javaPackage = javaPackage;
	}
	public String getCreatePath() {
		return createPath;
	}
	public void setCreatePath(String createPath) {
		this.createPath = createPath;
	}
	public List<TableColumnsMappingJavaPropertyBean> getTableColumnsMappingJavaPropertyBeans() {
		return tableColumnsMappingJavaPropertyBeans;
	}
	public void setTableColumnsMappingJavaPropertyBeans(
			List<TableColumnsMappingJavaPropertyBean> tableColumnsMappingJavaPropertyBeans) {
		this.tableColumnsMappingJavaPropertyBeans = tableColumnsMappingJavaPropertyBeans;
	}
	
	
}
