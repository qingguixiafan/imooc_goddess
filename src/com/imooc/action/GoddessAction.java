package com.imooc.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.imooc.dao.GoddessDao;
import com.imooc.model.Goddess;

public class GoddessAction {
	public void add(Goddess goddess) throws SQLException {
		GoddessDao dao = new GoddessDao();
		dao.addGoddess(goddess);
	}
	
	public void delete(int id) throws SQLException {
		GoddessDao dao = new GoddessDao();
		dao.deleteGoddess(id);
	}
	
	public void edit(Goddess goddess) throws SQLException {
		GoddessDao dao = new GoddessDao();
		dao.updataGoddess(goddess);
	}
	
	public List<Goddess> querys() {
		GoddessDao dao = new GoddessDao();
		return dao.querys();
	}
	
	public List<Goddess> querys(List<Map<String, Object>> param) throws SQLException {
		GoddessDao dao = new GoddessDao();
		return dao.query(param);
	}
	
	public Goddess query(int id) throws SQLException {
		GoddessDao dao = new GoddessDao();
		return dao.query(id);
	}
	
	//无用的测试代码
	/*public static void main(String[] args) throws SQLException {
		GoddessDao gd = new GoddessDao();
		
		Goddess g = new Goddess();
		g.setId(2);
		g.setAge(19);
		g.setUser_name("小明");
		g.setSex(1);
		g.setEmail("668@168.com");
		g.setMobile("13755242687");
		g.setCreate_user("admin");
		g.setUpdate_user(null);
		g.setBirthday(new Date());
		g.setIsDel(0);
//		gd.updataGoddess(g);
		gd.addGoddess(g);
//		List<Goddess> list = gd.query("明", "5524", "@");
//		for (Goddess goddess : list) {
//			System.out.print(goddess.getId()+" "+goddess.getUser_name()+" "+goddess.getAge());
//			System.out.println(" "+goddess.getMobile()+" "+goddess.getEmail());
//		}
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "user_name");
        map.put("rela", "=");
      //这里加上单引号是因为这里的值将会编译成为sql语句，sql语句中的String类型需要对值加引号
        map.put("value", "'小明'");
        list.add(map);
        map = new HashMap<String, Object>();
        map.put("name", "mobile");
        map.put("rela", "like");
      //这里加上单引号是因为这里的值将会编译成为sql语句，sql语句中的String类型需要对值加引号
        map.put("value", "'%5524%'");
        list.add(map);
        List<Goddess> result = gd.query(list);
        for (Goddess goddess : result) {
			System.out.println(goddess.toString());
		}
        
//		Goddess g = gd.query(2);
//		System.out.println(g);
//		gd.deleteGoddess(1);
//		List<Goddess> list = gd.querys();
//		for (Goddess goddess : list) {
//			System.out.println(goddess.getId()+" "+goddess.getUser_name()+" "+goddess.getAge());
//		}
	}*/
}
