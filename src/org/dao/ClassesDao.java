package org.dao;
import java.util.List;
import org.model.Bjxx;

public interface  ClassesDao {
		//插入专业
		public void save(Bjxx bj);
		//根据编号条件查询
		public Bjxx find(Integer bj);
		//根据专业查询
		public List findClasses(String bj,int pageNow,int pageSize);
		//查询所有的专业信息
		public List findAll(int pageNow,int pageSize);
		public int findBjSize();
		//根据专业编号删除学院
		public void delete(Integer classid);
		//修改专业信息
		public void update(Bjxx bj);
}