package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.MyUser;
import com.demo.beans.RegisterUser;

import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

public class RegistrationServlet extends HttpServlet {

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		int uid=Integer.parseInt(req.getParameter("uid"));
		String nm=req.getParameter("nm");
		String addr=req.getParameter("addr");
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		String skill[]=req.getParameterValues("skill");
		String gender=req.getParameter("gender");
		String city=req.getParameter("city");
		
//		public RegisterUser(int uid, String n addr, String gender, String[] skills, String city,
//				String uname) {
		RegisterUser ru=new RegisterUser(uid,nm,addr,gender,skill,city,uname);
		MyUser user=new MyUser(uname,pass,"user");
		LoginService ls=new LoginServiceImpl();
		ls.addRegisterUser(ru,user);
		RequestDispatcher rd=req.getRequestDispatcher("Login.html");
		rd.forward(req, res);
	}
}
