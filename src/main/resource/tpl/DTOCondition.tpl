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
public class ${javaClassBean.name}  implements Serializable{
		
		private  ${javaClassBean.javaDtoCLassBean.name}    ${(javaClassBean.javaDtoCLassBean.name?substring(0,1))?lower_case}${javaClassBean.javaDtoCLassBean.name?substring(1)};
			
		public ${javaClassBean.javaDtoCLassBean.name} get${javaClassBean.javaDtoCLassBean.name}(){
			return ${(javaClassBean.javaDtoCLassBean.name?substring(0,1))?lower_case}${javaClassBean.javaDtoCLassBean.name?substring(1)};
		}
		
		public void set${javaClassBean.javaDtoCLassBean.name}(${javaClassBean.javaDtoCLassBean.name}  ${(javaClassBean.javaDtoCLassBean.name?substring(0,1))?lower_case}${javaClassBean.javaDtoCLassBean.name?substring(1)}){
			this.${(javaClassBean.javaDtoCLassBean.name?substring(0,1))?lower_case}${javaClassBean.javaDtoCLassBean.name?substring(1)} = ${(javaClassBean.javaDtoCLassBean.name?substring(0,1))?lower_case}${javaClassBean.javaDtoCLassBean.name?substring(1)};
		}
		
		
		
}