package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.QueryCondition;
import com.bean.TableColumnsMappingJavaPropertyBean;
import com.dao.TableColumnDao;
import com.dao.impl.TableColumnDaoImpl;

public class Tool {
	public static void main(String [] wzq){
		ApplicationContext acnt = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		TableColumnDao tableColumnDao = acnt.getBean("tableColumnDao", TableColumnDaoImpl.class);
		QueryCondition condition = new QueryCondition();
		condition.setTableName("account");
		List<TableColumnsMappingJavaPropertyBean> list = tableColumnDao.query(condition);
		for(TableColumnsMappingJavaPropertyBean bean:list){
			System.out.println("tableName:"+bean.getTableName()+"column:"+bean.getTableColumnName()+"--- type:"+bean.getTableColumnType()+"----key:"+bean.getTableColumKey());
		}
		
	}
}
