
package org.dao;
import java.util.List;
import org.model.Zyxx;

public interface  ProfessionDao {
		//����רҵ
		public void save(Zyxx xy);
		//���ݱ��������ѯ
		public Zyxx find(Integer xy);
		//����רҵ��ѯ
		public List findProfession(String zy,int pageNow,int pageSize);
		//��ѯ���е�רҵ��Ϣ
		public List findAll(int pageNow,int pageSize);
		public int findZySize();
		//����רҵ���ɾ��ѧԺ
		public void delete(Integer professionid);
		//�޸�רҵ��Ϣ
		public void update(Zyxx xy);
}