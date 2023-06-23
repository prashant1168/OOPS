package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.MyUser;
import com.demo.beans.RegisterUser;

public class LoginDaoImpl implements LoginDao{
	private static Connection conn;
	private static PreparedStatement pst,psiru,psiu;
	static {
		conn=DBUtil.getMyConnection();
		//changed myuser1 to myuser
		try {
			pst=conn.prepareStatement("select * from MyUser where uname=? and password=?");
			psiru=conn.prepareStatement("insert into registereduser values(?,?,?,?,?,?,?)");
			psiu=conn.prepareStatement("insert into MyUser values(?,?,?)");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public MyUser verifyUser(String uname, String password) {
		try {
			pst.setString(1,uname);
			pst.setString(2, password);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				return new MyUser(uname,password,rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
//	public RegisterUser(int uid, String name, String addr, String gender, String[] skills, String city,
//			String uname) {
	@Override
	public int registerUser(RegisterUser ru, MyUser user) {
		try {
			psiru.setInt(1, ru.getUid());
			psiru.setString(2, ru.getName());
			psiru.setString(3, ru.getAddr());
			psiru.setString(4, ru.getGender());
			psiru.setNString(5, ru.getSkills()[1]);
			psiru.setString(6, ru.getCity());
			psiru.setString(7, ru.getUname());
			psiru.executeUpdate();
			psiu.setString(1,user.getUname());
			psiu.setString(2, user.getPasswd());
			psiu.setString(3, user.getRole());
			return psiu.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
