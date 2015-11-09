<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE sqlMap PUBLIC "-//ibatis.apache.org//DTD SQL Map 2.0//EN" "http://ibatis.apache.org/dtd/sql-map-2.dtd" >
<sqlMap namespace="${sqlMapXmlBean.nameSpace}">
		
	   <typeAlias alias="${sqlMapXmlBean.aliasDtoClassName}" type="${sqlMapXmlBean.aliasDtoClassFullName}"/>
	   <typeAlias alias="${sqlMapXmlBean.aliasDtoOpConditionClassName}" type="${sqlMapXmlBean.aliasDtoOpConditionClassFullName}"/>
	   <resultMap class="${sqlMapXmlBean.aliasDtoClassName}" id="${sqlMapXmlBean.aliasDtoClassName}Result">
	   		<#list sqlMapXmlBean.javaDtoCLassBean.tableColumnsMappingJavaPropertyBeans in tblcmns>
	   		<result property="${tblcmns.javaBeanPropertyName}" column="${tblcmns.tableColumnName}" jdbcType="${tblcmns.tableColumnType}"/>
	   		</#list>
	   </resultMap>
	
	<sql id="tableColumns">
	
	<#list sqlMapXmlBean.javaDtoCLassBean.tableColumnsMappingJavaPropertyBeans in tblcmns>
	 <#if tblcmns_index==0>
	 	${tblcmns.tableColumnName}
	 <#else>
	 	,${tblcmns.tableColumnName}
	 </#if>
	</#list>
	
	</sql>
	
	
	<insert id="" parameterClass="${sqlMapXmlBean.aliasDtoClassName}" >
		<selectKey resultClass="">
		<selectKey>
	</insert>
	
	
	
	
	
   <select id="query" resultMap="mappingBeanResult" parameterClass="queryCondition">
   	 select TABLE_NAME, COLUMN_NAME, substring_index(COLUMN_TYPE,"(",1) COLUMN_TYPE, 
   	 case COLUMN_KEY 
   	 when 'PRI' then '0'
   	 else '1'
   	 end  COLUMN_KEY
   	  from information_schema.COLUMNS where table_name = #tableName#
   </select>

</sqlMap>