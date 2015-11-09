package com.bean;

/**
 * 查询类，模板类
 * @author wuzhq
 *
 */
public class JavaDtoConditionClassBean extends JavaBaseClassBean{
	private JavaDtoCLassBean javaDtoCLassBean;
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public JavaDtoCLassBean getJavaDtoCLassBean() {
		return javaDtoCLassBean;
	}
	public void setJavaDtoCLassBean(JavaDtoCLassBean javaDtoCLassBean) {
		this.javaDtoCLassBean = javaDtoCLassBean;
	}
	
}
