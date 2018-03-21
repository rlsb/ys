package org.dao.imp;

import java.util.List;

import org.dao.CollegeDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Xyxx;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class CollegeImp extends HibernateDaoSupport implements CollegeDao{
	//增
		public void save(Xyxx xy) {
			try{
				Session session =getHibernateTemplate().getSessionFactory().openSession();
				Transaction ts = session.beginTransaction();
				session.save(xy);
				ts.commit();
				session.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		//查
		public Xyxx find(Integer xy) {
			// TODO Auto-generated method stub		
			Session session = getHibernateTemplate().getSessionFactory().openSession();
			Transaction ts = session.beginTransaction();
			System.out.println("1111111");
			Query query=session.createQuery("from Xyxx where facultyid=?");
			query.setParameter(0, xy);
			Xyxx gl=(Xyxx) query.uniqueResult();
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
				Query query = session.createQuery("from Xyxx order by facultyid");
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
		public int findXySize() {
			// TODO Auto-generated method stub
			Session session = getHibernateTemplate().getSessionFactory().openSession();
			try{
				Transaction ts = session.beginTransaction();
				return session.createQuery("from Xyxx").list().size();
			}catch(Exception e){
				e.printStackTrace();
				return 0;
			}finally{
				session.close();
			}
		}
		//删
		@Override
		public void delete(Integer facultyid) {
			// TODO Auto-generated method stub
			try{
				Session session =getHibernateTemplate().getSessionFactory().openSession();
				Transaction ts = session.beginTransaction();
				Xyxx xy = find(facultyid);
				session.delete(xy);
				ts.commit();
				session.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		@Override
		public void update(Xyxx xy) {
			// TODO Auto-generated method stub
			try{
				Session session = getHibernateTemplate().getSessionFactory().openSession();
				Transaction ts = session.beginTransaction();
				session.update(xy);
				ts.commit();
				session.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public List findCollege(Integer xy,int pageNow,int pageSize) {
			// TODO Auto-generated method stub
			try{
				Session session = getHibernateTemplate().getSessionFactory().openSession();
				Transaction ts = session.beginTransaction();
				Query query = session.createQuery("from Xyxx  where facultyid=?");
				query.setParameter(0, xy);
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
