package com.demo.dao;

import com.demo.beans.MyUser;
import com.demo.beans.RegisterUser;

public interface LoginDao {

	MyUser verifyUser(String uname, String password);

	int registerUser(RegisterUser ru, MyUser user);



}
