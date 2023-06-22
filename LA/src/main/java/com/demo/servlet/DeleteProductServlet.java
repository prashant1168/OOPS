package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.demo.service.*;
public class DeleteProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid=Integer.parseInt(request.getParameter("pid"));
		ProductService ps=new ProductServiceImpl();
		int n=ps.deleteById(pid);
		RequestDispatcher rd=request.getRequestDispatcher("product");
		rd.forward(request, response);
	}
}
