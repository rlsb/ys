package org.service.imp;

import java.util.List;

import org.dao.ClassesDao;
import org.model.Bjxx;
import org.service.ClaService;


public class ClaManage implements ClaService{
	private ClassesDao bjDao;

	// ��ѯ
	public Bjxx find(Integer bj) {
		return bjDao.find(bj);
	}
	//����רҵ
	public void save(Bjxx bj) {
		// TODO Auto-generated method stub
		bjDao.save(bj);
	}
	//������רҵ��Ϣ
	@Override
	public List findAll(int pageNow, int pageSize) {
			// TODO Auto-generated method stub
		return bjDao.findAll(pageNow, pageSize);
	}

	@Override
	public int findBjSize() {
			// TODO Auto-generated method stub
		return bjDao.findBjSize();
	}
	
	
	public ClassesDao getBjDao() {
		return bjDao;
	}
	public void setBjDao(ClassesDao bjDao) {
		this.bjDao = bjDao;
	}
	@Override
	public void delete(Integer classid) {
		// TODO Auto-generated method stub
		bjDao.delete(classid);
	}
	@Override
	public void update(Bjxx bj) {
		// TODO Auto-generated method stub
		bjDao.update(bj);
	}
	@Override
	public List findClasses(String bj,int pageNow,int pageSize) {
		// TODO Auto-generated method stub
		return bjDao.findClasses(bj,pageNow,pageSize);
	}

}
