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
	
	//����ѧ�źͿ������
	public Login find(String username,String password){
		return lDao.find(username, password);
	}
	//�Ƿ���ڸ�ѧ�ŵ��û�
	public boolean existXh(String username){
		return lDao.existXh(username);
	}
	}
