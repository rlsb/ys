package org.service;

import org.model.Login;



public interface LoginService {
	//����ѧ�źͿ������
	public Login find(String username,String password);
	//�Ƿ���ڸ�ѧ�ŵ��û�
	public boolean existXh(String username);
}
