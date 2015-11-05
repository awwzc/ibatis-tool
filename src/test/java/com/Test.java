package com;

import java.io.IOException;
import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class Test {
private static SqlMapClient client;
	
	public static SqlMapClient  getClient(){
		String  resource = "sqlmap-Config.xml";
		try {
			Reader reader =  Resources.getResourceAsReader(resource);
			if(null==client){
				client = SqlMapClientBuilder.buildSqlMapClient(reader);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return client;
	}
	
	public static void main(String[] args) {
		System.out.println(getClient());
	}
}
