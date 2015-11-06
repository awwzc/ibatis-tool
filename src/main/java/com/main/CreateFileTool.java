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

import com.bean.JavaBaseClassBean;
import com.bean.JavaDtoCLassBean;
import com.bean.JavaDtoConditionClassBean;

import freemarker.template.Template;
import freemarker.template.TemplateException;

public class CreateFileTool {
	
	private static FreeMarkerConfigurer freeMarkerConfigurer ;   
    private static final String ENCODING = "utf-8";  
	
	
	public static void createJavaFile(String tplName,JavaBaseClassBean javaBaseClassBean) throws IOException, TemplateException{
		ApplicationContext acnt = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		freeMarkerConfigurer = (FreeMarkerConfigurer) acnt.getBean("freemarkerConfig");
		Template template =  freeMarkerConfigurer.getConfiguration().getTemplate(tplName);
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("javaClassBean", javaBaseClassBean);
		File outDirFile = new File(javaBaseClassBean.getCreatePath()); 
		if(!outDirFile.exists()){  
            outDirFile.mkdir();  
        } 
		String classNameSuf = "";
		if(javaBaseClassBean instanceof JavaDtoCLassBean){
			classNameSuf = "DTO";
		}else if(javaBaseClassBean instanceof JavaDtoConditionClassBean){
			classNameSuf = "";
		}
		File javaFile = toJavaFilename(outDirFile,javaBaseClassBean.getJavaPackage(),javaBaseClassBean.getName(),classNameSuf);
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
	
	private static File toJavaFilename(File outDirFile, String javaPackage, String javaClassName,String classNameSuf) {  
        String packageSubPath = javaPackage.replace('.', '/');  
        File packagePath = new File(outDirFile, packageSubPath);  
        File file = new File(packagePath, javaClassName + classNameSuf+".java");  
        if(!packagePath.exists()){  
            packagePath.mkdirs();  
        }  
        return file;  
    }  
	
}
