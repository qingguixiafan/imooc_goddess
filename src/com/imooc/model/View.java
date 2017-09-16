package com.imooc.model;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.imooc.dao.GoddessDao;

public class View {
	public void add(){
		Goddess goddess = new Goddess();
		Scanner console = new Scanner(System.in);
		System.out.println("请输入女神姓名");
		String name = console.next();
		goddess.setUser_name(name);
		System.out.println("请输入女神性别");
		int sex = "男".equals(console.next()) ? 1:0;
		goddess.setSex(sex);
		System.out.println("请输入女神年龄");
		goddess.setAge(console.nextInt());
		System.out.println("请输入女神生日,格式：2014-02-14");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = null;
		try {
			birthday = format.parse(console.next());
		} catch (ParseException e1) {
			System.out.println("生日格式错误，先这样。");
			e1.printStackTrace();
		}
		goddess.setBirthday(birthday);
		System.out.println("请输入女神邮箱");
		goddess.setEmail(console.next());
		System.out.println("请输入女神电话");
		goddess.setMobile(console.next());
		goddess.setCreate_user("ADMIN");
		goddess.setUpdate_user("ADMIN");
		goddess.setIsDel(1);
		GoddessDao dao = new GoddessDao();
		try {
			dao.addGoddess(goddess);
			System.out.println("添加女神成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
