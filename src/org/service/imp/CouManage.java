package org.service.imp;

import java.util.List;

import org.dao.CourseDao;
import org.model.Kcxx;
import org.service.CouService;


public class CouManage implements CouService{
	private CourseDao kcDao;

	// 查询
	public Kcxx find(Integer kc) {
		return kcDao.find(kc);
	}
	//增加学院
	public void save(Kcxx kc) {
		// TODO Auto-generated method stub
		kcDao.save(kc);
	}
	//查所有学院信息
	@Override
	public List findAll(int pageNow, int pageSize) {
			// TODO Auto-generated method stub
		return kcDao.findAll(pageNow, pageSize);
	}

	@Override
	public int findKcSize() {
			// TODO Auto-generated method stub
		return kcDao.findKcSize();
	}
	
	
	public CourseDao getKcDao() {
		return kcDao;
	}
	public void setKcDao(CourseDao kcDao) {
		this.kcDao = kcDao;
	}
	@Override
	public void delete(Integer courseid) {
		// TODO Auto-generated method stub
		kcDao.delete(courseid);
	}
	@Override
	public void update(Kcxx kc) {
		// TODO Auto-generated method stub
		kcDao.update(kc);
	}
	@Override
	public List findCourse(Integer kc,int pageNow,int pageSize) {
		// TODO Auto-generated method stub
		return kcDao.findCourse(kc,pageNow,pageSize);
	}

}
