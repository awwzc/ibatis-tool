package ${javaClassBean.javaPackage};
<#list javaClassBean.importJavas as importJava>
import	${importJava} ;
</#list>

/**
 * 
 * @author ${javaClassBean.author}
 *
 */
@Service("${javaClassBean.AntionName} ") 
public class ${javaClassBean.name}  implements  ${javaClassBean.implementsServiceInterfaceName}{
	@Resource
	private ${javaClassBean.relyDaoInterfaceName} ${javaClassBean.relyDaoInterfacePropertyName} ;
	
	public Long add(${javaClassBean.dtoClassName} bean){
		return ${javaClassBean.relyDaoInterfacePropertyName}.add(bean);
	}
	public  ${javaClassBean.dtoClassName}   findById (Long id){
		return ${javaClassBean.relyDaoInterfacePropertyName}.findById(id);
	}
	public  List<${javaClassBean.dtoClassName}>  findByCondition(${javaClassBean.queryConditionCLassName}  condition){
	   return  ${javaClassBean.relyDaoInterfacePropertyName}.findByCondition(condition);
	}
	public  int findCountByCondition(${javaClassBean.queryConditionCLassName}  condition){
		return ${javaClassBean.relyDaoInterfacePropertyName}.findCountByCondition(bean);
	}
	public int  update(${javaClassBean.dtoClassName} bean){
		return ${javaClassBean.relyDaoInterfacePropertyName}.update(bean);
	}
	public int delete(${javaClassBean.dtoClassName} bean){
		return ${javaClassBean.relyDaoInterfacePropertyName}.delete(bean);
	}
}