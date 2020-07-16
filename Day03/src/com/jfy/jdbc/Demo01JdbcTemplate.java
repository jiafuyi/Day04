package com.jfy.jdbc;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jfy.bean.User;

public class Demo01JdbcTemplate {
	public static void main(String[] args) {
		//addUser();
		//updateUser();
		//deleteUser();
		//fingUserByIdl();
		count();
	}

	private static void count() {
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		Long count=jt.queryForObject("select count(1) from person",long.class);
		System.out.println(count);
		
	}

	/*private static void fingUserByIdl() {
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		  List <User> list =jt.query("select * from person where id=?",new BeanPropertyRowMapper(User.class),4);
		  User user2 = list.get(0);
		  System.out.println(user2);
		  System.out.println(list);
		
	}  */
		  
		  
		  
		  
		  
	/*private static void fingUserByIdl() {
		  JdbcTemplate jt= new JdbcTemplate(JDBCUtils.getDataSource());
		
		List <User> list =jt.query("select * from person",new BeanPropertyRowMapper<User>(User.class));
		for(User user : list){
			System.out.println(user);
	   }
	}*/
	/*private static void updateUser() {
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		int update = jt.update("update person set name=?,age=?,password=? where id=?","哈哈哈",19,"22",1);
		System.out.println(update);
	}*/

	/*private static void deleteUser() {
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		int update=jt.update("delete from person where id=?" ,1);
		int update2=jt.update("delete from person where id=?" ,2);
		int update3=jt.update("delete from person where id=?" ,3);
		int update4=jt.update("delete from person where id=?" ,4);
		int update5=jt.update("delete from person where id=?" ,5);
		System.out.println(update);
		System.out.println(update5);
		System.out.println(update2);
		System.out.println(update3);
		System.out.println(update4);
			
	}*/

	
	
	
	
	/*private static void addUser() {
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		String sql = "insert into person (id,name,username,password,age,special,height) values (?,?,?,?,?,?,?)";
        int update = jt.update(sql,1,"哈哈","11","11","18","快快",180);
        int update1 = jt.update(sql,2,"拉拉","22","22","18","慢慢",180);
        int update2 = jt.update(sql,3,"钉钉","33","33","17","中中",170);
        int update3 = jt.update(sql,4,"嘟嘟","44","44","15","小小",150);
        int update4 = jt.update(sql,5,"呼呼","55","55","20","大大",188);
        System.out.println(update);
        System.out.println(update1);
        System.out.println(update2);
        System.out.println(update3);
        System.out.println(update4);
	}*/
}
