package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	List<Product> getAllProducts();

	int addProduct(Product p);

	int deleteById(int pid);

	Product getProductById(int pid);

}
