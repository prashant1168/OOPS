package com.demo.service;

import com.demo.beans.MyUser;
import com.demo.beans.RegisterUser;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService{
	private LoginDao loginDao;

	public LoginServiceImpl() {
		super();
		this.loginDao=new LoginDaoImpl();
		// TODO Auto-generated constructor stub
	}

	@Override
	public MyUser validate(String uname, String password) {
		return loginDao.verifyUser(uname,password);
	}

	@Override
	public int addRegisterUser(RegisterUser ru, MyUser user) {
		return loginDao.registerUser(ru,user);
		
	}
	

}
