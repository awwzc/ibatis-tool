package com.dao;

import java.util.List;

import com.bean.QueryCondition;
import com.bean.TableColumnsMappingJavaPropertyBean;

public interface TableColumnDao {
	List<TableColumnsMappingJavaPropertyBean> query(QueryCondition condition);
}
