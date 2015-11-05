<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE sqlMap PUBLIC "-//ibatis.apache.org//DTD SQL Map 2.0//EN" "http://ibatis.apache.org/dtd/sql-map-2.dtd" >
<sqlMap namespace="mysql">
	   <typeAlias alias="mappingBean" type="com.bean.TableColumnsMappingJavaPropertyBean"/>
	   <typeAlias alias="queryCondition" type="com.bean.QueryCondition"/>
	   <resultMap class="mappingBean" id="mappingBeanResult">
	   		<result property="tableColumnName" column="COLUMN_NAME" jdbcType="VARCHAR"/>
	   		<result property="tableColumnType" column="COLUMN_TYPE" jdbcType="VARCHAR"/>
	   		<result property="tableColumKey" column="COLUMN_KEY" jdbcType="VARCHAR"/>
	   		<result property="tableName" column="TABLE_NAME" jdbcType="VARCHAR"/>
	   </resultMap>

   <select id="query" resultMap="mappingBeanResult" parameterClass="queryCondition">
   	 select TABLE_NAME, COLUMN_NAME, substring_index(COLUMN_TYPE,"(",1) COLUMN_TYPE, 
   	 case COLUMN_KEY 
   	 when 'PRI' then '0'
   	 else '1'
   	 end  COLUMN_KEY
   	  from information_schema.COLUMNS where table_name = #tableName#
   </select>

</sqlMap>