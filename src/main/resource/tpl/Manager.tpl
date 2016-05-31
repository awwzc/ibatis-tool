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
	public Map<Object,Object> add(Map<Object,Object> condition ) ;
	public Map<Object,Object>   findById (Map<Object,Object> condition);
	public  Map<Object,Object>  findByCondition(Map<Object,Object> condition);
	public  Map<Object,Object> findCountByCondition(Map<Object,Object> condition);
	public Map<Object,Object>  update(Map<Object,Object> condition);
	public Map<Object,Object> delete(Map<Object,Object> condition);
}