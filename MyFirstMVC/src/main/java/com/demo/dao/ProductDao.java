package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	List<Product> findAllProduct();

	int removeById(int pid);

	int save(Product p);

}
