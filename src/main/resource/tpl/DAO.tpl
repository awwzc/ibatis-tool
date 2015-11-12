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
	public Long add(${javaClassBean.dtoName} ${(javaClassBean.dtoName?substring(0,1))?lower_case}${javaClassBean.dtoName?substring(1)} );
	public  ${javaClassBean.dtoName}   findById (Long id);
	public  List<${javaClassBean.dtoName}>  findByCondition(${javaClassBean.dtoConditionName}  ${(javaClassBean.dtoConditionName?substring(0,1))?lower_case}${javaClassBean.dtoConditionName?substring(1)});
	public  int findCountByCondition(${javaClassBean.dtoConditionName}  ${(javaClassBean.dtoConditionName?substring(0,1))?lower_case}${javaClassBean.dtoConditionName?substring(1)});
	public int  update(${javaClassBean.dtoConditionName}  ${(javaClassBean.dtoConditionName?substring(0,1))?lower_case}${javaClassBean.dtoConditionName?substring(1)});
	public int delete(${javaClassBean.dtoConditionName}  ${(javaClassBean.dtoConditionName?substring(0,1))?lower_case}${javaClassBean.dtoConditionName?substring(1)});
}