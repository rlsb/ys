package org.service;

import org.model.Login;



public interface LoginService {
	//根据学号和口令查找
	public Login find(String username,String password);
	//是否存在该学号的用户
	public boolean existXh(String username);
}
