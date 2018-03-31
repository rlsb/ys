package org.service;

import java.util.List;

import org.model.Xyxx;


public interface ColService {
	//插入学生
	public void save(Xyxx xy);
	//根据学号查询
	public Xyxx find(Integer xy);
	//根据学院查询
	public List findCollege(String xy,int pageNow,int pageSize);
	//查询所有
	public List findAll(int pageNow,int pageSize);
	public int findXySize();
	//删
	public void delete(Integer facultyid);
	//修改
	public void update(Xyxx xy);
}
