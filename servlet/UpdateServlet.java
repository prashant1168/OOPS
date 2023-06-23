package com.demo.servlet;
import com.demo.service.*;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.MyUser;
import com.demo.beans.Product;


@WebServlet("/updateproduct")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		MyUser u=(MyUser) session.getAttribute("user");
		if(u!=null && u.getRole().equals("admin")) {
			int pid=Integer.parseInt(request.getParameter("pid"));
			String uname=request.getParameter("pname");
			int qty=Integer.parseInt(request.getParameter("qty"));
			float price=Float.parseFloat(request.getParameter("price"));
			Product p=new Product(pid,uname,qty,price);
			ProductService ps=new ProductServiceImpl();
			int n=ps.addProduct(p);
			RequestDispatcher rd=request.getRequestDispatcher("product");
			rd.forward(request, response);
		}
	}

}
