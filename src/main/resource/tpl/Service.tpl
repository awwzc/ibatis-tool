package ${javaClassBean.javaPackage};

<#list javaClassBean.importJavas as importJava>
import	${importJava} ;
</#list>

/**
 * 
 * @author ${javaClassBean.author}
 *
 */
 
public interface ${javaClassBean.name} {
	public Long add(${javaClassBean.dtoClassName}  bean );
	public ${javaClassBean.dtoClassName}   findById (Long id);
	public  List<${javaClassBean.dtoClassName}}>  findByCondition(${javaClassBean.queryConditionCLassName}  condition);
	public  int findCountByCondition(${javaClassBean.queryConditionCLassName}  condition);
	public int  update(${javaClassBean.queryConditionCLassName}  condition);
	public int delete(${javaClassBean.queryConditionCLassName}  condition);
}