package org.service;

import java.util.List;

import org.model.Zyxx;

public interface ProService {
	//����ѧ��
		public void save(Zyxx zy);
		//����ѧ�Ų�ѯ
		public Zyxx find(Integer zy);
		//����ѧԺ��ѯ
		public List findProfession(String zy,int pageNow,int pageSize);
		//��ѯ����
		public List findAll(int pageNow,int pageSize);
		public int findZySize();
		//ɾ
		public void delete(Integer professionid);
		//�޸�
		public void update(Zyxx zy);
}
