package com.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.bean.javaDtoCLassBean;

import freemarker.template.Template;
import freemarker.template.TemplateException;

public class CreateFileTool {
	
	private static FreeMarkerConfigurer freeMarkerConfigurer ;   
    private static final String ENCODING = "utf-8";  
	
	
	public static void createJavaFile(String tplName,javaDtoCLassBean javaDtoCLassBean) throws IOException, TemplateException{
		ApplicationContext acnt = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		freeMarkerConfigurer = (FreeMarkerConfigurer) acnt.getBean("freemarkerConfig");
		Template template =  freeMarkerConfigurer.getConfiguration().getTemplate(tplName);
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("javaClassBean", javaDtoCLassBean);
		File outDirFile = new File(javaDtoCLassBean.getCreatePath()); 
		if(!outDirFile.exists()){  
            outDirFile.mkdir();  
        }  
		File javaFile = toJavaFilename(outDirFile,javaDtoCLassBean.getJavaPackage(),javaDtoCLassBean.getName());
		if(null!=javaFile){
			Writer writer = new FileWriter(javaFile);
			template.process(param, writer);
			writer.flush();  
             System.out.println("文件生成路径：" + javaFile.getCanonicalPath());  
               
             writer.close();  
		}
		// 输出到Console控制台  
        Writer out = new OutputStreamWriter(System.out);  
        template.process(param, out);  
        out.flush();  
        out.close();  
	}
	
	private static File toJavaFilename(File outDirFile, String javaPackage, String javaClassName) {  
        String packageSubPath = javaPackage.replace('.', '/');  
        File packagePath = new File(outDirFile, packageSubPath);  
        File file = new File(packagePath, javaClassName + "DTO.java");  
        if(!packagePath.exists()){  
            packagePath.mkdirs();  
        }  
        return file;  
    }  
	
}
