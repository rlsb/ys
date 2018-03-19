package org.service.imp;

import java.util.List;

import org.dao.GlyDao;
import org.model.Glyxx;
import org.service.GlyService;

public class GlyManage implements GlyService {
	private GlyDao glyDao;

	// 查询
	public Glyxx find(String gly) {
		return glyDao.find(gly);
	}
	//增加管理员
	public void save(Glyxx gly) {
		// TODO Auto-generated method stub
		glyDao.save(gly);
	}
	//查所有管理员信息
	@Override
	public List findAll(int pageNow, int pageSize) {
			// TODO Auto-generated method stub
		return glyDao.findAll(pageNow, pageSize);
	}

	@Override
	public int findGlySize() {
			// TODO Auto-generated method stub
		return glyDao.findGlySize();
	}
	
	public GlyDao getGlyDao() {
		return glyDao;
	}

	public void setGlyDao(GlyDao glyDao) {
		this.glyDao = glyDao;
	}
	@Override
	public void delete(String username) {
		// TODO Auto-generated method stub
		glyDao.delete(username);
	}
	@Override
	public void update(Glyxx gly) {
		// TODO Auto-generated method stub
		glyDao.update(gly);
	}
	@Override
	public List findCollege(String gly,int pageNow,int pageSize) {
		// TODO Auto-generated method stub
		return glyDao.findCollege(gly,pageNow,pageSize);
	}

	
}
