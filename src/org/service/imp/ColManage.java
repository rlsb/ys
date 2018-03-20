package org.service.imp;

import java.util.List;

import org.dao.CollegeDao;
import org.model.Xyxx;
import org.service.ColService;


public class ColManage implements ColService{
	private CollegeDao xyDao;

	// ��ѯ
	public Xyxx find(String xy) {
		return xyDao.find(xy);
	}
	//����ѧԺ
	public void save(Xyxx xy) {
		// TODO Auto-generated method stub
		xyDao.save(xy);
	}
	//������ѧԺ��Ϣ
	@Override
	public List findAll(int pageNow, int pageSize) {
			// TODO Auto-generated method stub
		return xyDao.findAll(pageNow, pageSize);
	}

	@Override
	public int findXySize() {
			// TODO Auto-generated method stub
		return xyDao.findXySize();
	}
	
	
	public CollegeDao getXyDao() {
		return xyDao;
	}
	public void setXyDao(CollegeDao xyDao) {
		this.xyDao = xyDao;
	}
	@Override
	public void delete(String username) {
		// TODO Auto-generated method stub
		xyDao.delete(username);
	}
	@Override
	public void update(Xyxx xy) {
		// TODO Auto-generated method stub
		xyDao.update(xy);
	}
	@Override
	public List findCollege(String xy,int pageNow,int pageSize) {
		// TODO Auto-generated method stub
		return xyDao.findCollege(xy,pageNow,pageSize);
	}

}
