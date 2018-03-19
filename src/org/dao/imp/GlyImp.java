package org.dao.imp;

import java.util.List;

import org.dao.GlyDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Glyxx;
import org.springframework.orm.hibernate3.SessionFactoryUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class GlyImp extends HibernateDaoSupport implements GlyDao{
	//增
	public void save(Glyxx gly) {
		try{
			Session session =getHibernateTemplate().getSessionFactory().openSession();
			Transaction ts = session.beginTransaction();
			session.save(gly);
			ts.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//查
	public Glyxx find(String gly) {
		// TODO Auto-generated method stub		
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();
		System.out.println("1111111");
		Query query=session.createQuery("from Glyxx where username=?");
		query.setParameter(0, gly);
		Glyxx gl=(Glyxx) query.uniqueResult();
		query.setMaxResults(1);
		ts.commit();
		session.close();
		System.out.println(gl.getFacultyName());
		return gl;
	}
	//查所有
	@Override
	public List findAll(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		try{
			Session session = getHibernateTemplate().getSessionFactory().openSession();
			Transaction ts = session.beginTransaction();
			Query query = session.createQuery("from Glyxx order by username");
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
	public int findGlySize() {
		// TODO Auto-generated method stub
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		try{
			Transaction ts = session.beginTransaction();
			return session.createQuery("from Glyxx").list().size();
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}finally{
			session.close();
		}
	}
	//删
	@Override
	public void delete(String username) {
		// TODO Auto-generated method stub
		try{
			Session session =getHibernateTemplate().getSessionFactory().openSession();
			Transaction ts = session.beginTransaction();
			Glyxx gly = find(username);
			session.delete(gly);
			ts.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	@Override
	public void update(Glyxx gly) {
		// TODO Auto-generated method stub
		try{
			Session session = getHibernateTemplate().getSessionFactory().openSession();
			Transaction ts = session.beginTransaction();
			session.update(gly);
			ts.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public List findCollege(String gly,int pageNow,int pageSize) {
		// TODO Auto-generated method stub
		try{
			Session session = getHibernateTemplate().getSessionFactory().openSession();
			Transaction ts = session.beginTransaction();
			Query query = session.createQuery("from Glyxx  where facultyName=?");
			query.setParameter(0, gly);
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
