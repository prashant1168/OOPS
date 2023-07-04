package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Product;
import com.demo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService ps;
	
	@GetMapping("/viewProduct")
	public ModelAndView displayAllProduct() {
		List<Product> plist=ps.getAllProduct();
		return new ModelAndView("displayproduct","plist",plist);
		
	}
	//,@RequestParam String pname,@RequestParam int qty,@RequestParam float price
	@GetMapping("/delete/{pid}")
	public ModelAndView deleteProductById(@PathVariable("pid") int pid) {
		int n=ps.deleteById(pid);
		return new ModelAndView("redirect:/product/viewProduct");
	}
	@GetMapping("/addnewproduct")
	  public String displayaddform() {
		  return "addproduct";
	  }
	//@GetMapping("/addproduct")
	@PostMapping("/addproduct")
	public ModelAndView addProduct(@RequestParam int pid, @RequestParam String pname,@RequestParam int qty,@RequestParam float price) {
		Product p=new Product(pid,qty,pname,price);
		ps.addNewProduct(p);
		return new ModelAndView("redirect:/product/viewProduct");
		
	}
	@GetMapping("/logout")
	public ModelAndView logout() {
		return new ModelAndView("redirect:/");
	}

}
