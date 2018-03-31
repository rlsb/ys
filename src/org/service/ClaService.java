package org.service;

import java.util.List;

import org.model.Bjxx;

public interface ClaService {
	//插入学生
		public void save(Bjxx bj);
		//根据学号查询
		public Bjxx find(Integer bj);
		//根据学院查询
		public List findClasses(String bj,int pageNow,int pageSize);
		//查询所有
		public List findAll(int pageNow,int pageSize);
		public int findBjSize();
		//删
		public void delete(Integer classid);
		//修改
		public void update(Bjxx bj);
}
