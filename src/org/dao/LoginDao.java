package org.dao;

import org.model.Login;

public interface LoginDao {
		//����ѧ�źͿ������
		public Login find(String username,String password);
		//�Ƿ���ڸ�ѧ�ŵ��û�
		public boolean existXh(String username);
	
}
