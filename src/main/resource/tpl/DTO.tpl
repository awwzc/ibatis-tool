package ${javaClassBean.javaPackage};

import java.io.Serializable;
<#list javaClassBean.importJavas as importJava>
import	${importJava} ;
</#list>
/**
 * 
 * @author ${javaClassBean.author}
 *
 */
public class ${javaClassBean.name}DTO  implements Serializable{
		
		<#list javaClassBean.tableColumnsMappingJavaPropertyBeans as tableColumnsMappingJavaPropertyBean>
		private ${tableColumnsMappingJavaPropertyBean.javaBeanPropertyType}   ${tableColumnsMappingJavaPropertyBean.javaBeanPropertyName};
		</#list>
		
		
		<#list javaClassBean.tableColumnsMappingJavaPropertyBeans as tmjn>
		public ${tmjn.javaBeanPropertyType} get${tmjn.javaBeanPropertyForSetOrGetMethodName}() {
			return ${tmjn.javaBeanPropertyName};
		}
		
		public void set${tmjn.javaBeanPropertyForSetOrGetMethodName}(${tmjn.javaBeanPropertyType }  ${tmjn.javaBeanPropertyName} ) {
			this.${tmjn.javaBeanPropertyName} = ${tmjn.javaBeanPropertyName};
		}
		</#list>
		
		
}