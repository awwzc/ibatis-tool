package ${javaClassBean.javaPackage};
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
<#list javaClassBean.importJavas as importJava>
import	${importJava} ;
</#list>

/**
 * 
 * @author ${javaClassBean.author}
 *
 */
 
public class ${javaClassBean.name} extends SqlMapClientDaoSupport implements ${javaClassBean.impelemtsClassName}{
	private String NAMESPACE = ${javaClassBean.sqlMapNameSpace};
	public Long add(${javaClassBean.dtoName} ${(javaClassBean.dtoName?substring(0,1))?lower_case}${javaClassBean.dtoName?substring(1)} ){
		return this.getSqlMapClientTemplate().insert(NAMESPACE+".add",${(javaClassBean.dtoName?substring(0,1))?lower_case}${javaClassBean.dtoName?substring(1)});
	}
	public  ${javaClassBean.dtoName}   findById (Long id){
		return (${javaClassBean.dtoName})this.getSqlMapClientTemplate().queryForObject(NAMESPACE+".findById",id);
	}
	public  List<${javaClassBean.dtoName}>  findByCondition(${javaClassBean.dtoConditionName}  ${(javaClassBean.dtoConditionName?substring(0,1))?lower_case}${javaClassBean.dtoConditionName?substring(1)}){
	   return this.getSqlMapClientTemplate().queryForList(NAMESPACE+".findByCondition",${(javaClassBean.dtoConditionName?substring(0,1))?lower_case}${javaClassBean.dtoConditionName?substring(1)});
	}
	public  int findCountByCondition(${javaClassBean.dtoConditionName}  ${(javaClassBean.dtoConditionName?substring(0,1))?lower_case}${javaClassBean.dtoConditionName?substring(1)}){
		return this.getSqlMapClientTemplate().queryForObject(NAMESPACE+".findCountByCondition",${(javaClassBean.dtoConditionName?substring(0,1))?lower_case}${javaClassBean.dtoConditionName?substring(1)});
	}
	public int  update(${javaClassBean.dtoConditionName}  ${(javaClassBean.dtoConditionName?substring(0,1))?lower_case}${javaClassBean.dtoConditionName?substring(1)}){
		return this.getSqlMapClientTemplate().update(NAMESPACE+".update",${(javaClassBean.dtoConditionName?substring(0,1))?lower_case}${javaClassBean.dtoConditionName?substring(1)});
	}
	public int delete(${javaClassBean.dtoConditionName}  ${(javaClassBean.dtoConditionName?substring(0,1))?lower_case}${javaClassBean.dtoConditionName?substring(1)}){
		return this.getSqlMapClientTemplate().delete(NAMESPACE+".update",${(javaClassBean.dtoConditionName?substring(0,1))?lower_case}${javaClassBean.dtoConditionName?substring(1)});
	}
}