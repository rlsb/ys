package org.service;

import java.util.List;

import org.model.Bjxx;

public interface ClaService {
	//����ѧ��
		public void save(Bjxx bj);
		//����ѧ�Ų�ѯ
		public Bjxx find(Integer bj);
		//����ѧԺ��ѯ
		public List findClasses(String bj,int pageNow,int pageSize);
		//��ѯ����
		public List findAll(int pageNow,int pageSize);
		public int findBjSize();
		//ɾ
		public void delete(Integer classid);
		//�޸�
		public void update(Bjxx bj);
}
