package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {


	List<Product> getAllProduct();

	int deleteById(int pid);

	void addNewProduct(Product p);

}
