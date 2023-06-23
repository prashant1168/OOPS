package com.demo.service;

import com.demo.beans.MyUser;
import com.demo.beans.RegisterUser;

public interface LoginService {

	MyUser validate(String uname, String password);

	int addRegisterUser(RegisterUser ru, MyUser user);

}
