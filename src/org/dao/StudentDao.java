package org.dao;

import java.util.List;

import org.model.Xsxx;

public interface StudentDao {
	        //���ݱ��������ѯ
			public Xsxx find(Integer xs);
			//����רҵ��ѯ
			public List findStudent(String xs,int pageNow,int pageSize);
			//��ѯ���е�רҵ��Ϣ
			public List findAll(int pageNow,int pageSize);
			public int findXsSize();
}
