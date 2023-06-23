package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
private static Connection con;
public static Connection getMyConnection() {
	
	
		try {
			if(con==null) {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//String url="jdbc:mysql://127.0.0.1:3306/mysql?useSSL=false";
			String url="jdbc:mysql://192.168.10.150/dac12?useSSL=false";
			con=DriverManager.getConnection(url,"dac12","welcome");
			if(con!=null) {
				System.out.println("connection done");
			}
			
			}
			return con;
		} catch (SQLException e) {
		System.out.println("error occur");
		return null;
		}
		
	

}
public static void closeMyConnection() {
	

		try {
			if(con!=null) {
			con.close();
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
}
