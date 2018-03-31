package org.dao;
import java.util.List;
import org.model.Kcxx;

public interface  CourseDao {
		//插入专业
		public void save(Kcxx kc);
		//根据编号条件查询
		public Kcxx find(Integer kc);
		//根据专业查询
		public List findCourse(String kc,int pageNow,int pageSize);
		//查询所有的专业信息
		public List findAll(int pageNow,int pageSize);
		public int findKcSize();
		//根据专业编号删除学院
		public void delete(Integer courseid);
		//修改专业信息
		public void update(Kcxx kc);
}