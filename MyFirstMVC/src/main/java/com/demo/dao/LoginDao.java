package com.demo.dao;

import com.demo.beans.MyUser;

public interface LoginDao {

	MyUser verifyUser(String unm, String pass);

}
