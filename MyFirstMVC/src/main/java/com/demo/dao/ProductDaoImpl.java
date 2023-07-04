package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;
@Repository
public class ProductDaoImpl implements ProductDao{
@Autowired	
private JdbcTemplate jdbcTemp;
	@Override
	public List<Product> findAllProduct() {
		return jdbcTemp.query("select * from product",(rs,num)->{
			Product p=new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(3));
			p.setPrice(rs.getFloat(4));
			return p;
		});
	}
	@Override
	public int removeById(int pid) {
		// TODO Auto-generated method stub
		return jdbcTemp.update("delete from product where pid=?",new Object[] {
				pid
		});
	}
	@Override
	public int save(Product p) {
		return jdbcTemp.update("insert into product values(?,?,?,?)",new Object[] {
				p.getPid(),p.getPname(),p.getQty(),p.getPrice()
		});
		
	}

}
