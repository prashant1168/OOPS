package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao {
	private static Connection conn;
	private static PreparedStatement psgetall,psadd,psrbid;
	static {
		
		try {
			conn=DBUtil.getMyConnection();
			psgetall=conn.prepareStatement("select * from product;");
			psadd=conn.prepareStatement("insert into product values(?,?,?,?);");
			psrbid=conn.prepareStatement("delete from product where pid=?;");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Product> findAllProducts() {
		List<Product> plist=new ArrayList<>();
		try {
			ResultSet rs=psgetall.executeQuery();
			while(rs.next()) {
				plist.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4)));
			}
			return plist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertProduct(Product p) {
		try {
			psadd.setInt(1,p.getPid());
			psadd.setString(2, p.getPname());
			psadd.setInt(3, p.getQty());
			psadd.setFloat(4, p.getPrice());
			return psadd.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int removeById(int pid) {
		try {
			psrbid.setInt(1,pid);
			return psrbid.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
