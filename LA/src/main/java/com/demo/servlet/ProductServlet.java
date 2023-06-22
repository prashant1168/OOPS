package com.demo.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.service.ProductServiceImpl;
import com.demo.beans.MyUser;
import com.demo.beans.Product;
import com.demo.service.ProductService;

public class ProductServlet extends HttpServlet{
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
	HttpSession session=req.getSession();
	MyUser u=(MyUser)session.getAttribute("user");
	if(u!=null && u.getRole().equals("admin")) {
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	ProductService ps=new ProductServiceImpl();
	List<Product> lst=ps.getAllProducts();
	out.println("<h1>Products-:</h1>");
	out.println("<table border='2'><tr><th>Product Id</th><th>Product Name</th><th>Quantity</th><th>Price</th></tr>");
	for(Product p:lst) {
		out.println("<tr><td>"+p.getPid()+"</td><td>"+p.getPname()+"</td><td>"+p.getQty()+"</td><td>"+p.getPrice()+"</td>");
		out.println("<td><a href='delete?pid="+p.getPid()+"'>delete</a></td></tr>");
	}
	out.println("</table>");
	out.println("<br><a href='addproduct.html'>Add new Product</a>");
	out.println("<br><a href='Login.html'>Signout</a>");
	}
	else {
		System.out.println(u);
		
		System.out.println("not admin");
		RequestDispatcher rd=req.getRequestDispatcher("Login.html");
		rd.forward(req, res);
	}
}
}
