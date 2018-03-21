package org.dao;

import java.util.List;

import org.model.Xyxx;



public interface CollegeDao {
		//插入学院
		public void save(Xyxx xy);
		//根据编号条件查询
		public Xyxx find(Integer xy);
		//根据学院查询
		public List findCollege(Integer xy,int pageNow,int pageSize);
		//查询所有的学院信息
		public List findAll(int pageNow,int pageSize);
		public int findXySize();
		//根据学院编号删除学院
		public void delete(Integer facultyid);
		//修改学院信息
		public void update(Xyxx xy);
}
