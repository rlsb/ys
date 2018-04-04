package org.service.imp;

import java.util.List;

import org.dao.StudentDao;
import org.model.Xsxx;
import org.service.StuService;

public class StuManage implements StuService{
	private StudentDao xsDao;

	// 查询
	public Xsxx find(Integer xs) {
		return xsDao.find(xs);
	}
	
	//查所有专业信息
	@Override
	public List findAll(int pageNow, int pageSize) {
			// TODO Auto-generated method stub
		return xsDao.findAll(pageNow, pageSize);
	}

	@Override
	public int findXsSize() {
			// TODO Auto-generated method stub
		return xsDao.findXsSize();
	}
	@Override
	public List findStudent(String xs,int pageNow,int pageSize) {
		// TODO Auto-generated method stub
		return xsDao.findStudent(xs,pageNow,pageSize);
	}

	public StudentDao getXsDao() {
		return xsDao;
	}

	public void setXsDao(StudentDao xsDao) {
		this.xsDao = xsDao;
	}
	
	
}
