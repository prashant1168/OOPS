package com.demo.beans;

import java.util.Arrays;

public class RegisterUser {
	private int uid;
	private String name;
	private String addr;
	private String uname;
	private String skills[];
	private String gender;
	private String city;
	public RegisterUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegisterUser(int uid, String name, String addr, String gender, String[] skills, String city,
			String uname) {
		super();
		this.uid = uid;
		this.name = name;
		this.addr = addr;
		this.gender = gender;
		this.skills = skills;
		this.city = city;
		this.uname = uname;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "RegisterUser [uid=" + uid + ", name=" + name + ", addr=" + addr + ", uname=" + uname + ", skills="
				+ Arrays.toString(skills) + ", gender=" + gender + ", city=" + city + "]";
	}
	
	
}
