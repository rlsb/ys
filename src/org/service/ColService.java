package org.service;

import java.util.List;

import org.model.Xyxx;


public interface ColService {
	//����ѧ��
	public void save(Xyxx xy);
	//����ѧ�Ų�ѯ
	public Xyxx find(String xy);
	//����ѧԺ��ѯ
	public List findCollege(String xy,int pageNow,int pageSize);
	//��ѯ����
	public List findAll(int pageNow,int pageSize);
	public int findXySize();
	//ɾ
	public void delete(String username);
	//�޸�
	public void update(Xyxx xy);
}
