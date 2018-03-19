package org.dao;

import java.util.List;

import org.model.Glyxx;

public interface GlyDao {
	//插入教师
	public void save(Glyxx gly);
	//根据学号条件查询
	public Glyxx find(String gly);
	//根据学院查询
	public List findCollege(String gly,int pageNow,int pageSize);
	//查询所有的管理员信息
	public List findAll(int pageNow,int pageSize);
	public int findGlySize();
	//根据教师用户名删除教师
	public void delete(String username);
	//修改教师信息
	public void update(Glyxx gly);
	
}
