package org.dao;
import java.util.List;
import org.model.Kcxx;

public interface  CourseDao {
		//����רҵ
		public void save(Kcxx kc);
		//���ݱ��������ѯ
		public Kcxx find(Integer kc);
		//����רҵ��ѯ
		public List findCourse(String kc,int pageNow,int pageSize);
		//��ѯ���е�רҵ��Ϣ
		public List findAll(int pageNow,int pageSize);
		public int findKcSize();
		//����רҵ���ɾ��ѧԺ
		public void delete(Integer courseid);
		//�޸�רҵ��Ϣ
		public void update(Kcxx kc);
}