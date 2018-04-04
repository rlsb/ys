package org.dao;

import java.util.List;

import org.model.Xsxx;

public interface StudentDao {
	        //根据编号条件查询
			public Xsxx find(Integer xs);
			//根据专业查询
			public List findStudent(String xs,int pageNow,int pageSize);
			//查询所有的专业信息
			public List findAll(int pageNow,int pageSize);
			public int findXsSize();
}
