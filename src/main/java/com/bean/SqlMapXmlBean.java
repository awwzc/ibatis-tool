package com.bean;
/**
 * ibtais sqlmap-xml 模板配置类
 * @author wuzhq
 *
 */
public class SqlMapXmlBean {
	private JavaDtoCLassBean javaDtoCLassBean;
	private String nameSpace;
	private String aliasDtoClassName;
	private String aliasDtoClassFullName;
	private String aliasDtoOpConditionClassName;
	private String aliasDtoOpConditionClassFullName;
	private String tableName;
	private String createPath;
	private String javaPackage;
	private String  fileName;
	
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
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
	public JavaDtoCLassBean getJavaDtoCLassBean() {
		return javaDtoCLassBean;
	}
	public void setJavaDtoCLassBean(JavaDtoCLassBean javaDtoCLassBean) {
		this.javaDtoCLassBean = javaDtoCLassBean;
	}
	public String getNameSpace() {
		return nameSpace;
	}
	public void setNameSpace(String nameSpace) {
		this.nameSpace = nameSpace;
	}
	public String getAliasDtoClassName() {
		return aliasDtoClassName;
	}
	public void setAliasDtoClassName(String aliasDtoClassName) {
		this.aliasDtoClassName = aliasDtoClassName;
	}
	public String getAliasDtoClassFullName() {
		return aliasDtoClassFullName;
	}
	public void setAliasDtoClassFullName(String aliasDtoClassFullName) {
		this.aliasDtoClassFullName = aliasDtoClassFullName;
	}
	public String getAliasDtoOpConditionClassName() {
		return aliasDtoOpConditionClassName;
	}
	public void setAliasDtoOpConditionClassName(String aliasDtoOpConditionClassName) {
		this.aliasDtoOpConditionClassName = aliasDtoOpConditionClassName;
	}
	public String getAliasDtoOpConditionClassFullName() {
		return aliasDtoOpConditionClassFullName;
	}
	public void setAliasDtoOpConditionClassFullName(
			String aliasDtoOpConditionClassFullName) {
		this.aliasDtoOpConditionClassFullName = aliasDtoOpConditionClassFullName;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
}
