package com.bean;



/**
 * 数据库表跟javabean属性类型映射bean
 * @author wuzhq
 *
 */
public class TableColumnsMappingJavaPropertyBean  {
		private String tableName;
		private String tableColumnName;
		private String tableColumnType;
		private String tableColumKey;//主键标示 0 主键，1非主键
		private String JDBCType;
		private String javaBeanPropertyName;
		private String javaBeanPropertyType;
		private String javaBeanPropertyTypeFullPath;
		private String javaBeanPropertyForSetOrGetMethodName;
		
		
		public String getJavaBeanPropertyForSetOrGetMethodName() {
			return javaBeanPropertyForSetOrGetMethodName;
		}
		public void setJavaBeanPropertyForSetOrGetMethodName(
				String javaBeanPropertyForSetOrGetMethodName) {
			this.javaBeanPropertyForSetOrGetMethodName = javaBeanPropertyForSetOrGetMethodName;
		}
		public String getTableName() {
			return tableName;
		}
		public void setTableName(String tableName) {
			this.tableName = tableName;
		}
		public String getJavaBeanPropertyTypeFullPath() {
			return javaBeanPropertyTypeFullPath;
		}
		public void setJavaBeanPropertyTypeFullPath(String javaBeanPropertyTypeFullPath) {
			this.javaBeanPropertyTypeFullPath = javaBeanPropertyTypeFullPath;
		}
		public String getTableColumKey() {
			return tableColumKey;
		}
		public void setTableColumKey(String tableColumKey) {
			this.tableColumKey = tableColumKey;
		}
		public String getTableColumnType() {
			return tableColumnType;
		}
		public void setTableColumnType(String tableColumnType) {
			this.tableColumnType = tableColumnType;
		}
		public String getJDBCType() {
			return JDBCType;
		}
		public void setJDBCType(String jDBCType) {
			JDBCType = jDBCType;
		}
		public String getTableColumnName() {
			return tableColumnName;
		}
		public void setTableColumnName(String tableColumnName) {
			this.tableColumnName = tableColumnName;
		}
		public String getJavaBeanPropertyName() {
			return javaBeanPropertyName;
		}
		public void setJavaBeanPropertyName(String javaBeanPropertyName) {
			this.javaBeanPropertyName = javaBeanPropertyName;
		}
		public String getJavaBeanPropertyType() {
			return javaBeanPropertyType;
		}
		public void setJavaBeanPropertyType(String javaBeanPropertyType) {
			this.javaBeanPropertyType = javaBeanPropertyType;
		}
		
		
}
