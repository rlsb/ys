package org.dao.imp;

import java.util.List;

import org.dao.StudentDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Xsxx;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class StudentImp extends HibernateDaoSupport implements StudentDao{
	
	//查
	public Xsxx find(Integer xs) {
		// TODO Auto-generated method stub		
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();
		System.out.println("1111111");
		Query query=session.createQuery("from Xsxx where studentid=?");
		query.setParameter(0, xs);
		Xsxx gl=(Xsxx) query.uniqueResult();
		query.setMaxResults(1);
		ts.commit();
		session.close();
		
		return gl;
	}
	//查所有
	@Override
	public List findAll(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		try{
			Session session = getHibernateTemplate().getSessionFactory().openSession();
			Transaction ts = session.beginTransaction();
			Query query = session.createQuery("from Xsxx order by studentid");
			int firstResult = (pageNow-1)*pageSize;
			query.setFirstResult(firstResult);
			query.setMaxResults(pageSize);
			List list = query.list();
			ts.commit();
			session.close();
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public int findXsSize() {
		// TODO Auto-generated method stub
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		try{
			Transaction ts = session.beginTransaction();
			return session.createQuery("from Xsxx").list().size();
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}finally{
			session.close();
		}
	}
	
	public List findStudent(String xs,int pageNow,int pageSize) {
		// TODO Auto-generated method stub
		try{
			Session session = getHibernateTemplate().getSessionFactory().openSession();
			Transaction ts = session.beginTransaction();
			Query query = session.createQuery("from Xsxx  where studentname=?");
			query.setParameter(0, xs);
			int firstResult = (pageNow-1)*pageSize;
			query.setFirstResult(firstResult);
			query.setMaxResults(pageSize);
			List list = query.list();
			ts.commit();
			session.close();
			session = null;
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
