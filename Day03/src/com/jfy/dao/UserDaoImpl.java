package com.jfy.dao;


import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jfy.bean.User;
import com.jfy.jdbc.JDBCUtils;



    public class UserDaoImpl implements UserDao {
         JdbcTemplate jt=new JdbcTemplate(JDBCUtils.getDataSource());

		public List<User>findAllUser(){
			String sql="select name,sex,age from t_user";
			List <User> list =jt.query(sql,new BeanPropertyRowMapper<User>(User.class));
			return list;
		}
}
