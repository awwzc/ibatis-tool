<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE sqlMap PUBLIC "-//ibatis.apache.org//DTD SQL Map 2.0//EN" "http://ibatis.apache.org/dtd/sql-map-2.dtd" >
<sqlMap namespace="${sqlMapXmlBean.nameSpace}">
		
	   <typeAlias alias="${sqlMapXmlBean.aliasDtoClassName}" type="${sqlMapXmlBean.aliasDtoClassFullName}"/>
	   <typeAlias alias="${sqlMapXmlBean.aliasDtoOpConditionClassName}" type="${sqlMapXmlBean.aliasDtoOpConditionClassFullName}"/>
	   <resultMap class="${sqlMapXmlBean.aliasDtoClassName}" id="${sqlMapXmlBean.aliasDtoClassName}Result">
	   		<#list sqlMapXmlBean.javaDtoCLassBean.tableColumnsMappingJavaPropertyBeans as tblcmns>
	   		<result property="${tblcmns.javaBeanPropertyName}" column="${tblcmns.tableColumnName}" jdbcType="${tblcmns.tableColumnType}"/>
	   		</#list>
	   </resultMap>
	
	<sql id="tableColumns">
	
	<#list sqlMapXmlBean.javaDtoCLassBean.tableColumnsMappingJavaPropertyBeans as tblcmns>
	 <#if tblcmns_index==0>
	 	${tblcmns.tableColumnName}
	 <#else>
	 	,${tblcmns.tableColumnName}
	 </#if>
	</#list>
	
	</sql>
	
	<sql id="querySql">
	
	<dynamic prepend="where">
		 <#list sqlMapXmlBean.javaDtoCLassBean.tableColumnsMappingJavaPropertyBeans as tblcmns>
		 	<isNotEmpty prepend="and" property="${tblcmns.javaBeanPropertyName}">
		 		${tblcmns.tableColumnName}=#${tblcmns.javaBeanPropertyName}#
		 	</isNotEmpty>
		</#list>
	</dynamic>
	
	</sql>
	
	<insert id="add" parameterClass="${sqlMapXmlBean.aliasDtoClassName}" >
		insert into ${sqlMapXmlBean.tableName} (
			<include refid="tableColumns"/>
		) values
		(
			<#list sqlMapXmlBean.javaDtoCLassBean.tableColumnsMappingJavaPropertyBeans as tblcmns>
	 		<#if tblcmns_index==0>
	 			#${tblcmns.javaBeanPropertyName}#
			<#else>
	 			,#${tblcmns.javaBeanPropertyName}#
	 		</#if>
			</#list>
		)
		<selectKey resultClass="java.lang.Long" keyProperty="id">
			SELECT LAST_INSERT_ID()  
		<selectKey>
	</insert>
	
	<select id="findById" parameterClass="${sqlMapXmlBean.aliasDtoOpConditionClassName}" resultMap="${sqlMapXmlBean.aliasDtoClassName}Result">
		select  <include refid="tableColumns"/> from ${sqlMapXmlBean.tableName} 
		where id=#id#
	</select>
	
	<select id="findByCondition" parameterClass="${sqlMapXmlBean.aliasDtoOpConditionClassName}" resultMap="${sqlMapXmlBean.aliasDtoClassName}Result">
		select  <include refid="tableColumns"/> from ${sqlMapXmlBean.tableName} 
		where 
		<include refid="querySql"/>
	</select>
	
	<select id="findCountByCondition" parameterClass="${sqlMapXmlBean.aliasDtoOpConditionClassName}" resultMap="java.lang.Integer">
		select  count(1) from ${sqlMapXmlBean.tableName} 
		where 
		<include refid="querySql"/>
	</select>
	
	<update id="update" parameterClass="${sqlMapXmlBean.aliasDtoOpConditionClassName}">
	 update ${sqlMapXmlBean.tableName} set 
	 
	 <dynamic  prepend=",">
	 	 <#list sqlMapXmlBean.javaDtoCLassBean.tableColumnsMappingJavaPropertyBeans as tblcmns>
		 	<isNotEmpty prepend="," property="${tblcmns.javaBeanPropertyName}">
	
	 				${tblcmns.tableColumnName}=#javaDtoCLassBean.${tblcmns.javaBeanPropertyName}#
	 			
		 	</isNotEmpty>
		</#list>
	 	
	 </dynamic>
	 <include refid="querySql"/>
	</update>
	
	<delete id="delete" parameterClass="${sqlMapXmlBean.aliasDtoOpConditionClassName}">
		delete from  ${sqlMapXmlBean.tableName}  <include refid="querySql"/>
	</delete>
	
</sqlMap>