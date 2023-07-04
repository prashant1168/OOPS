package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.MyUser;
import com.demo.dao.LoginDao;
@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginDao loginDao;
	@Override
	public MyUser validateUser(String unm, String pass) {
		// TODO Auto-generated method stub
		return loginDao.verifyUser(unm,pass);
	}

}
