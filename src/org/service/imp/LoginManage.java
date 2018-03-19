package org.service.imp;

import org.dao.LoginDao;
import org.model.Login;
import org.service.LoginService;

public class LoginManage implements LoginService{
	private LoginDao lDao;

	public LoginDao getlDao() {
		return lDao;
	}

	public void setlDao(LoginDao lDao) {
		this.lDao = lDao;
	}
	
	//根据学号和口令查找
	public Login find(String username,String password){
		return lDao.find(username, password);
	}
	//是否存在该学号的用户
	public boolean existXh(String username){
		return lDao.existXh(username);
	}
	}
