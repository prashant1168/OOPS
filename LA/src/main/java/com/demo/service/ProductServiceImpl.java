package com.demo.service;

import java.util.List;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
	private ProductDao productDao;
	

	public ProductServiceImpl() {
		super();
		this.productDao = new ProductDaoImpl();
	}


	@Override
	public List<Product> getAllProducts() {
		
		return productDao.findAllProducts();
	}


	@Override
	public int addProduct(Product p) {
		// TODO Auto-generated method stub
		return productDao.insertProduct(p);
	}


	@Override
	public int deleteById(int pid) {
		// TODO Auto-generated method stub
		return productDao.removeById(pid);
	}

}
