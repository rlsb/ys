package org.dao;
import java.util.List;
import org.model.Bjxx;

public interface  ClassesDao {
		//����רҵ
		public void save(Bjxx bj);
		//���ݱ��������ѯ
		public Bjxx find(Integer bj);
		//����רҵ��ѯ
		public List findClasses(String bj,int pageNow,int pageSize);
		//��ѯ���е�רҵ��Ϣ
		public List findAll(int pageNow,int pageSize);
		public int findBjSize();
		//����רҵ���ɾ��ѧԺ
		public void delete(Integer classid);
		//�޸�רҵ��Ϣ
		public void update(Bjxx bj);
}