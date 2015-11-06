package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.javaDtoCLassBean;
import com.bean.QueryCondition;
import com.bean.TableColumnsMappingJavaPropertyBean;
import com.dao.TableColumnDao;
import com.dao.impl.TableColumnDaoImpl;

public class Tool {
	public static void main(String [] wzq) throws Exception{
		
		javaDtoCLassBean javaDtoCLassBean = new javaDtoCLassBean();
		InitJavaCLassBeanTool.init("t_order", "test", "./src-template", javaDtoCLassBean, 1, "wuzhq","mysql");
		CreateFileTool.createJavaFile("DTO.tpl", javaDtoCLassBean);
		
	}
	
	
	
	
	
}
