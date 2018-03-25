package org.service;

import java.util.List;

import org.model.Kcxx;


public interface CouService {
	//插入学生
	public void save(Kcxx kc);
	//根据学号查询
	public Kcxx find(Integer kc);
	//根据学院查询
	public List findCourse(Integer kc,int pageNow,int pageSize);
	//查询所有
	public List findAll(int pageNow,int pageSize);
	public int findKcSize();
	//删
	public void delete(Integer courseid);
	//修改
	public void update(Kcxx kc);
}