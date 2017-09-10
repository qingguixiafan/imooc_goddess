package com.imooc.model;

import java.util.Date;

public class Goddess {
	private Integer id;
	private String user_name;
	private Integer sex;
	private Integer age;
	private Date Birthday;
	private String email;
	private String mobile;
	private String create_user;
	private Date Create_data;
	private String update_user;
	private Date update_date;
	private Integer isDel;
	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String userName) {
		user_name = userName;
	}


	public Integer getSex() {
		return sex;
	}


	public void setSex(Integer sex) {
		this.sex = sex;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Date getBirthday() {
		return Birthday;
	}


	public void setBirthday(Date birthday) {
		Birthday = birthday;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getCreate_user() {
		return create_user;
	}


	public void setCreate_user(String createUser) {
		create_user = createUser;
	}


	public Date getCreate_data() {
		return Create_data;
	}


	public void setCreate_data(Date createData) {
		Create_data = createData;
	}


	public String getUpdate_user() {
		return update_user;
	}


	public void setUpdate_user(String updateUser) {
		update_user = updateUser;
	}


	public Date getUpdate_date() {
		return update_date;
	}


	public void setUpdate_date(Date updateDate) {
		update_date = updateDate;
	}


	public Integer getIsDel() {
		return isDel;
	}


	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}


	@Override
	public String toString() {
		return "Goddess [Birthday=" + Birthday + ", Create_data=" + Create_data
				+ ", age=" + age + ", create_user=" + create_user + ", email="
				+ email + ", id=" + id + ", isDel=" + isDel + ", mobile="
				+ mobile + ", sex=" + sex + ", update_date=" + update_date
				+ ", update_user=" + update_user + ", user_name=" + user_name
				+ "]";
	}
}
