package org.dao;

import java.util.List;

import org.model.Xyxx;



public interface CollegeDao {
		//����ѧԺ
		public void save(Xyxx xy);
		//���ݱ��������ѯ
		public Xyxx find(String xy);
		//����ѧԺ��ѯ
		public List findCollege(String xy,int pageNow,int pageSize);
		//��ѯ���е�ѧԺ��Ϣ
		public List findAll(int pageNow,int pageSize);
		public int findXySize();
		//����ѧԺ���ɾ��ѧԺ
		public void delete(String facultyname);
		//�޸�ѧԺ��Ϣ
		public void update(Xyxx xy);
}
