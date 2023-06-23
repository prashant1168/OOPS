package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Product;
import com.demo.service.*;

@WebServlet(name = "ProductEditServlet", urlPatterns = { "/edit" })
public class ProductEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		int pid=Integer.parseInt(request.getParameter("pid"));
		ProductService ps=new ProductServiceImpl();
		Product p=ps.getProductById(pid);
		out.println("<form action='/LA/updateproduct' method='post'>");
		out.println("Product id:<input type='text' name='pid' id='pid' value='"+p.getPid()+"'><br>");
		out.println("Product name:<input type='text' name='pname' id='pname' value='"+p.getPname()+"'><br>");
		out.println("Quantity:<input type='text' name='qty' id='qty' value='"+p.getQty()+"'>");
		out.println("Price:<input type='text' name='price' id='price' value='"+p.getPrice()+"'><br>");
		out.println("<button type='submit' name='btn' id='btn'>update</button>");
		out.println("</form>");
	}

}
