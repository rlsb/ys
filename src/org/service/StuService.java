package org.service;

import java.util.List;

import org.model.Xsxx;

public interface StuService {
	//����ѧ�Ų�ѯ
	public Xsxx find(Integer xs);
	//����ѧԺ��ѯ
	public List findStudent(String xs,int pageNow,int pageSize);
	//��ѯ����
	public List findAll(int pageNow,int pageSize);
	public int findXsSize();
}
