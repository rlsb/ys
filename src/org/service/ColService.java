package org.service;

import java.util.List;

import org.model.Xyxx;


public interface ColService {
	//����ѧ��
	public void save(Xyxx xy);
	//����ѧ�Ų�ѯ
	public Xyxx find(Integer xy);
	//����ѧԺ��ѯ
	public List findCollege(String xy,int pageNow,int pageSize);
	//��ѯ����
	public List findAll(int pageNow,int pageSize);
	public int findXySize();
	//ɾ
	public void delete(Integer facultyid);
	//�޸�
	public void update(Xyxx xy);
}
