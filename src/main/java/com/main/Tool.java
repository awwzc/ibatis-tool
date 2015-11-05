package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.QueryCondition;
import com.dao.TableColumnDao;
import com.dao.impl.TableColumnDaoImpl;

public class Tool {
	public static void main(String [] wzq){
		ApplicationContext acnt = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		TableColumnDao tableColumnDao = acnt.getBean("tableColumnDao", TableColumnDaoImpl.class);
		QueryCondition condition = new QueryCondition();
		condition.setTableName("t_order");
		System.out.println(tableColumnDao.query(condition));
	}
}
