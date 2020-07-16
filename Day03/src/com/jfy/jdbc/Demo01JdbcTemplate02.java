package com.jfy.jdbc;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.jfy.bean.User;
public class Demo01JdbcTemplate02 {

	public static void main(String[] args) {
		JdbcTemplate jt= new JdbcTemplate(JDBCUtils.getDataSource());
		String sql="select * from t_user";
		List <User> list =jt.query(sql,new BeanPropertyRowMapper<User>(User.class));
		for(User user : list){
			System.out.println(user);
		}
	
	}

	
 }

