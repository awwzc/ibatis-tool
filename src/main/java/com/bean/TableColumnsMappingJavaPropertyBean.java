package com.bean;



/**
 * 数据库表跟javabean属性类型映射bean
 * @author wuzhq
 *
 */
public class TableColumnsMappingJavaPropertyBean {
		private String tableColumnName;
		private String tableColumnType;
		private String JDBCType;
		private String javaBeanPropertyName;
		private String javaBeanPropertyType;
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
