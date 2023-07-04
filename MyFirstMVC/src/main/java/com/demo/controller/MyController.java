package com.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.MyUser;
import com.demo.service.LoginService;

@Controller
@RequestMapping("/mylogin")
public class MyController {
	@Autowired
	LoginService ls;
@GetMapping("/login")
public String showlogin() {
	return "Login";
}
@PostMapping("/validate")
public ModelAndView validateUser(HttpSession session,@RequestParam("uname") String unm,@RequestParam("pass") String pass) {
	MyUser m1=ls.validateUser(unm,pass);
	if(m1!=null) {
		session.setAttribute("user", m1);
		//return new ModelAndView("hello","msg","success");
		return new ModelAndView("redirect:/product/viewProduct");
	}
	else {
		return new ModelAndView("Login","msg","pls enter correct details");
	}
	
}
}
