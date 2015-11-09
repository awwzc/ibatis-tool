package com.main;

import com.bean.JavaDtoCLassBean;
import com.bean.JavaDtoConditionClassBean;
import com.bean.SqlMapXmlBean;

public class Tool {
	public static void main(String [] wzq) throws Exception{
		
		JavaDtoCLassBean javaDtoCLassBean = new JavaDtoCLassBean();
		InitJavaCLassBeanTool.init("t_order", "test", "./src-template", javaDtoCLassBean, 1, "wuzhq","mysql");
		CreateFileTool.createJavaFile("DTO.tpl", javaDtoCLassBean);
		JavaDtoConditionClassBean  javaDtoConditionClassBean = new JavaDtoConditionClassBean();
		InitJavaCLassBeanTool.initJavaDtoConditionClassBeanPropertyVals(javaDtoConditionClassBean, javaDtoCLassBean);
		CreateFileTool.createJavaFile("DTOCondition.tpl", javaDtoConditionClassBean);
		SqlMapXmlBean sqlMapXmlBean = new SqlMapXmlBean();
		InitJavaCLassBeanTool.initSqlMapXmlBeanPropertyVals(sqlMapXmlBean, javaDtoCLassBean, "t_order", "test");
		CreateFileTool.createSqlMapXmlFile("sqlmap-xml-mysql.tpl", sqlMapXmlBean);
	}
	
	
	
	
	
}
