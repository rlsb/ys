package org.service;

import java.util.List;

import org.model.Zyxx;

public interface ProService {
	//插入学生
		public void save(Zyxx zy);
		//根据学号查询
		public Zyxx find(Integer zy);
		//根据学院查询
		public List findProfession(String zy,int pageNow,int pageSize);
		//查询所有
		public List findAll(int pageNow,int pageSize);
		public int findZySize();
		//删
		public void delete(Integer professionid);
		//修改
		public void update(Zyxx zy);
}
