package org.service;

import java.util.List;

import org.model.Kcxx;


public interface CouService {
	//����ѧ��
	public void save(Kcxx kc);
	//����ѧ�Ų�ѯ
	public Kcxx find(Integer kc);
	//����ѧԺ��ѯ
	public List findCourse(Integer kc,int pageNow,int pageSize);
	//��ѯ����
	public List findAll(int pageNow,int pageSize);
	public int findKcSize();
	//ɾ
	public void delete(Integer courseid);
	//�޸�
	public void update(Kcxx kc);
}