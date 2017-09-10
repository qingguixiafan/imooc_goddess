package com.imooc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.imooc.db.DBUtil;
import com.imooc.model.Goddess;

public class GoddessDao {
	public void addGoddess(Goddess g) throws SQLException {
		Connection con = DBUtil.getConnection();
		String sql = "" + "insert into imooc_goddess"
				+ "(user_name,sex,age,birthday,email,mobile,"
				+ "create_user,create_date,update_user,update_date,isdel)"
				+ "values("
				+ "?,?,?,?,?,?,?,current_date(),?,current_date(),?)";
		PreparedStatement ptmt = con.prepareStatement(sql);

		ptmt.setString(1, g.getUser_name());
		ptmt.setInt(2, g.getSex());
		ptmt.setInt(3, g.getAge());
		ptmt.setDate(4, new Date(g.getBirthday().getTime())); // sql类型的Date对象强转为util类型的Date对象
		ptmt.setString(5, g.getEmail());
		ptmt.setString(6, g.getMobile());
		ptmt.setString(7, g.getCreate_user());
		ptmt.setString(8, g.getUpdate_user());
		ptmt.setInt(9, g.getIsDel());
		ptmt.execute();
	}

	public void deleteGoddess(Integer id) throws SQLException {
		Connection con = DBUtil.getConnection();
		String sql = "" + "delete from imooc_goddess where id = ?";
		PreparedStatement ptmt = con.prepareStatement(sql);
		ptmt.setInt(1, id);
		System.out.println(sql);
		ptmt.execute();

	}

	public void updataGoddess(Goddess g) throws SQLException {
		Connection con = DBUtil.getConnection();
		String sql = "" + "update imooc_goddess " + "set user_name = ? ,"
				+ "sex = ? ," + "age = ? ,"
				+ "birthday = ?, email = ?, mobile = ?, update_user = ?,"
				+ "update_date=current_date(), isDel = ? where id = ?";
		PreparedStatement ptmt = con.prepareStatement(sql);

		ptmt.setString(1, g.getUser_name());
		ptmt.setInt(2, g.getSex());
		ptmt.setInt(3, g.getAge());
		ptmt.setDate(4, new Date(g.getBirthday().getTime()));
		ptmt.setString(5, g.getEmail());
		ptmt.setString(6, g.getMobile());
		ptmt.setString(7, g.getUpdate_user());
		ptmt.setInt(8, g.getIsDel());
		ptmt.setInt(9, g.getId());
		ptmt.execute();
	}

	public List<Goddess> querys() {
		Connection con = DBUtil.getConnection();
		ResultSet res;
		List<Goddess> list = new ArrayList<Goddess>();
		Statement stat;
		Goddess gs = null;
		try {
			stat = con.createStatement();
			res = stat.executeQuery("select id,user_name,age from imooc_goddess");
			while (res.next()) {
				gs = new Goddess();
				gs.setId(res.getInt("id"));
				gs.setUser_name(res.getString("user_name"));
				gs.setAge(res.getInt("age"));
				list.add(gs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}

	public List<Goddess> query(String name, String mobile, String email) throws SQLException{
		Connection con = DBUtil.getConnection();
		String sql = "select * from imooc_goddess where "+
		"user_name like ? and mobile like ? and email like ?";
		PreparedStatement stat = con.prepareStatement(sql);
		stat.setString(1, "%"+name+"%");
		stat.setString(2, "%"+mobile+"%");
		stat.setString(3, "%"+email+"%");
		ResultSet res = stat.executeQuery();
		
		List<Goddess> result = new ArrayList<Goddess>();
		Goddess g;
		while (res.next()) {
			g = new Goddess();
			g.setId(res.getInt("id"));
			g.setUser_name(res.getString("user_name"));
			g.setAge(res.getInt("age"));
			g.setMobile(res.getString("mobile"));
			g.setEmail(res.getString("email"));
			result.add(g);
		}
		return result;
	}

	public List<Goddess> query(List<Map<String, Object>> param) throws SQLException {
		List<Goddess> result = new ArrayList<Goddess>();
		Connection con = DBUtil.getConnection();
		String sql = "select * from imooc_goddess where 1=1";
		if(param!=null && param.size()>0) {
			for (int i = 0; i < param.size(); i++) {
				Map<String, Object> map = param.get(i);
				sql += " and "+map.get("name")+" "+map.get("rela")+" "+map.get("value");
			}
		}
		PreparedStatement stat=con.prepareStatement(sql);
		ResultSet res = stat.executeQuery();
		Goddess g;
		while(res.next()){
			g=new Goddess();
			g.setId(res.getInt("id"));
			g.setUser_name(res.getString("user_name"));
			g.setAge(res.getInt("age"));
			g.setSex(res.getInt("sex"));
			g.setBirthday(res.getDate("birthday"));
			g.setEmail(res.getString("email"));
			g.setMobile(res.getString("mobile"));
			g.setCreate_data(res.getDate("create_date"));
			g.setCreate_user(res.getString("create_user"));
			g.setUpdate_date(res.getDate("update_date"));
			g.setUpdate_user(res.getString("update_user"));
			g.setIsDel(res.getInt("isdel"));
			result.add(g);
		}
		return result;
	}
	
	public Goddess query(Integer id) throws SQLException {
		Connection con = DBUtil.getConnection();
		String sql = "select * from imooc_goddess " + "where id =" + id + ";";
		PreparedStatement stat = con.prepareStatement(sql);
		ResultSet res = stat.executeQuery();
		Goddess g = null;
		while (res.next()) {
			g = new Goddess();
			g.setId(res.getInt("id"));
			g.setUser_name(res.getString("user_name"));
			g.setAge(res.getInt("age"));
			g.setSex(res.getInt("sex"));
			g.setBirthday(res.getDate("birthday"));
			g.setEmail(res.getString("email"));
			g.setMobile(res.getString("mobile"));
			g.setCreate_data(res.getDate("create_date"));
			g.setCreate_user(res.getString("create_user"));
			g.setUpdate_date(res.getDate("update_date"));
			g.setUpdate_user(res.getString("update_user"));
			g.setIsDel(res.getInt("isdel"));
		}
		return g;
	}
}
