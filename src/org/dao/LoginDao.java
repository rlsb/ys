package org.dao;

import org.model.Login;

public interface LoginDao {
		//根据学号和口令查找
		public Login find(String username,String password);
		//是否存在该学号的用户
		public boolean existXh(String username);
	
}
