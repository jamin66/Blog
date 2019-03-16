package com.jamin.pojo;

public class User {
	private String name;
	private String password;
	private int age;
	private char gender;
	
	public User() {
		super();
	}
	
	public User(String name, String password, int age, char gender) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", age=" + age + ", gender=" + gender + "]";
	}
}
