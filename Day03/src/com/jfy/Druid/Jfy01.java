package com.jfy.Druid;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.io.IOException;
import java.io.InputStream;

import javax.sql.DataSource;




import com.alibaba.druid.pool.DruidDataSourceFactory;

public class Jfy01 {

	public static void main(String[] args) throws Exception{
		Properties pro = new Properties();
		InputStream resourceAsStream = (InputStream) Jfy01.class.getClassLoader().getResourceAsStream("jdbc.properties");
		pro.load(resourceAsStream);
		String property = pro.getProperty("name");
		String password = pro.getProperty("password");
		System.out.println(password);
		System.out.println(property);
		DataSource datasource = DruidDataSourceFactory.createDataSource(pro);
		System.out.println(datasource.getConnection());
		Connection connection=datasource.getConnection();
		System.out.println("获取的连接"+connection);
		Statement createStatement = connection.createStatement();
		String sql = "select * from t_user";
		ResultSet rs = createStatement.executeQuery(sql);
		while (rs.next()){
			String name = rs.getString("name");
			String sex = rs.getString("sex");
			String age = rs.getString("age");
			System.out.println(name+sex+age);
		}
		connection.close();		
	}

}
