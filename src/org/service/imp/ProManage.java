package org.service.imp;

import java.util.List;

import org.dao.ProfessionDao;
import org.model.Zyxx;
import org.service.ProService;


public class ProManage implements ProService{
	private ProfessionDao zyDao;

	// 查询
	public Zyxx find(Integer zy) {
		return zyDao.find(zy);
	}
	//增加专业
	public void save(Zyxx zy) {
		// TODO Auto-generated method stub
		zyDao.save(zy);
	}
	//查所有专业信息
	@Override
	public List findAll(int pageNow, int pageSize) {
			// TODO Auto-generated method stub
		return zyDao.findAll(pageNow, pageSize);
	}

	@Override
	public int findZySize() {
			// TODO Auto-generated method stub
		return zyDao.findZySize();
	}
	
	
	public ProfessionDao getZyDao() {
		return zyDao;
	}
	public void setZyDao(ProfessionDao zyDao) {
		this.zyDao = zyDao;
	}
	@Override
	public void delete(Integer professionid) {
		// TODO Auto-generated method stub
		zyDao.delete(professionid);
	}
	@Override
	public void update(Zyxx zy) {
		// TODO Auto-generated method stub
		zyDao.update(zy);
	}
	@Override
	public List findProfession(String zy,int pageNow,int pageSize) {
		// TODO Auto-generated method stub
		return zyDao.findProfession(zy,pageNow,pageSize);
	}

}
