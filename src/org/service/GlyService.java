package org.service;

import java.util.List;

import org.model.Glyxx;

public interface GlyService {
	//插入学生
	public void save(Glyxx gly);
	//根据学号查询
	public Glyxx find(String gly);
	//根据学院查询
	public List findCollege(String gly,int pageNow,int pageSize);
	//查询所有
	public List findAll(int pageNow,int pageSize);
	public int findGlySize();
	//删
	public void delete(String username);
	//修改
	public void update(Glyxx gly);
}
