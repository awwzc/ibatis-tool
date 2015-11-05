package com.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.bean.QueryCondition;
import com.bean.TableColumnsMappingJavaPropertyBean;
import com.dao.TableColumnDao;

public class TableColumnDaoImpl  extends SqlMapClientDaoSupport implements TableColumnDao{
	private String dataBase;
	
	public String getDataBase() {
		return dataBase;
	}

	public void setDataBase(String dataBase) {
		this.dataBase = dataBase;
	}

	public List<TableColumnsMappingJavaPropertyBean> query(
			QueryCondition condition) {
		
		return this.getSqlMapClientTemplate().queryForList(dataBase+".query", condition);
	}

}
