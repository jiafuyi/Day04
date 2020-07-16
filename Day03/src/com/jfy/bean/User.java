package com.jfy.bean;

public class User {
	 private Integer id;
	 private String name;
	 private String username;
	 private String password;
	 private Integer age;
	 private String special;
	 private Integer height;
        
	    
		public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getSpecial() {
		return special;
	}


	public void setSpecial(String special) {
		this.special = special;
	}


	public Integer getHeight() {
		return height;
	}


	public void setHeight(Integer height) {
		this.height = height;
	}


		@Override
		public String toString() {
			  return "User [id=" + id + ", name=" + name + ", username=" + username
			    + ", password=" + password + ", age=" + age + ", special=" + special
			    + ", height=" + height + "]";
		}

}
