package com.bean;

import java.util.Set;

public class JavaBaseClassBean {
	private String javaPackage;
	private String  createPath;
	private String  name;
	private String author;
	private String superClass;
	private Set<String> importJavas;
	private Set<String> implementsInterfaces ;
	
	
	
	public Set<String> getImplementsInterfaces() {
		return implementsInterfaces;
	}
	public void setImplementsInterfaces(Set<String> implementsInterfaces) {
		this.implementsInterfaces = implementsInterfaces;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSuperClass() {
		return superClass;
	}
	public void setSuperClass(String superClass) {
		this.superClass = superClass;
	}
	public Set<String> getImportJavas() {
		return importJavas;
	}
	public void setImportJavas(Set<String> importJavas) {
		this.importJavas = importJavas;
	}
	
}
