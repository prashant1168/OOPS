package com.demo.servlet;

import java.io.IOException;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.MyUser;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

public class LoginServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String uname=req.getParameter("uname");
		String password=req.getParameter("pass");
		LoginService ls=new LoginServiceImpl();
		MyUser u=ls.validate(uname,password);
		if(u==null) {
			out.println("<h2>invalid credentials</h2>");
			RequestDispatcher rd=req.getRequestDispatcher("Login.html");
			rd.include(req, res);
		}
		else {
			System.out.println("in loginservlet----else");
			HttpSession session=req.getSession();
			if(session.isNew()) {
				System.out.println("new session");
				session.setAttribute("user",u);
			}
			RequestDispatcher rd1=req.getRequestDispatcher("product");
			rd1.forward(req, res);
		}
		
	}

}
