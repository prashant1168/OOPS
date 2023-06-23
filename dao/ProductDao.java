package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	List<Product> findAllProducts();

	int insertProduct(Product p);

	int removeById(int pid);

	Product findProductById(int pid);

}
