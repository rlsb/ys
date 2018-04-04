package org.service;

import java.util.List;

import org.model.Xsxx;

public interface StuService {
	//根据学号查询
	public Xsxx find(Integer xs);
	//根据学院查询
	public List findStudent(String xs,int pageNow,int pageSize);
	//查询所有
	public List findAll(int pageNow,int pageSize);
	public int findXsSize();
}
