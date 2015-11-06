package com.main;

import com.bean.JavaDtoCLassBean;
import com.bean.JavaDtoConditionClassBean;

public class Tool {
	public static void main(String [] wzq) throws Exception{
		
		JavaDtoCLassBean JavaDtoCLassBean = new JavaDtoCLassBean();
		InitJavaCLassBeanTool.init("t_order", "test", "./src-template", JavaDtoCLassBean, 1, "wuzhq","mysql");
		CreateFileTool.createJavaFile("DTO.tpl", JavaDtoCLassBean);
		JavaDtoConditionClassBean  javaDtoConditionClassBean = new JavaDtoConditionClassBean();
		InitJavaCLassBeanTool.initJavaDtoConditionClassBeanPropertyVals(javaDtoConditionClassBean, JavaDtoCLassBean);
		CreateFileTool.createJavaFile("DTOCondition.tpl", javaDtoConditionClassBean);
	}
	
	
	
	
	
}
