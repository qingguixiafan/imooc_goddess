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
		System.out.println("������Ů������");
		String name = console.next();
		goddess.setUser_name(name);
		System.out.println("������Ů���Ա�");
		int sex = "��".equals(console.next()) ? 1:0;
		goddess.setSex(sex);
		System.out.println("������Ů������");
		goddess.setAge(console.nextInt());
		System.out.println("������Ů������,��ʽ��2014-02-14");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = null;
		try {
			birthday = format.parse(console.next());
		} catch (ParseException e1) {
			System.out.println("���ո�ʽ������������");
			e1.printStackTrace();
		}
		goddess.setBirthday(birthday);
		System.out.println("������Ů������");
		goddess.setEmail(console.next());
		System.out.println("������Ů��绰");
		goddess.setMobile(console.next());
		goddess.setCreate_user("ADMIN");
		goddess.setUpdate_user("ADMIN");
		goddess.setIsDel(1);
		GoddessDao dao = new GoddessDao();
		try {
			dao.addGoddess(goddess);
			System.out.println("���Ů��ɹ�");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
