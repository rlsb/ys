package org.dao.imp;

import java.util.List;

import org.dao.CourseDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Kcxx;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class CourseImp  extends HibernateDaoSupport implements CourseDao{
	//增
		public void save(Kcxx kc) {
			try{
				Session session =getHibernateTemplate().getSessionFactory().openSession();
				Transaction ts = session.beginTransaction();
				session.save(kc);
				ts.commit();
				session.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		//查
		public Kcxx find(Integer kc) {
			// TODO Auto-generated method stub		
			Session session = getHibernateTemplate().getSessionFactory().openSession();
			Transaction ts = session.beginTransaction();
			System.out.println("1111111");
			Query query=session.createQuery("from Kcxx where courseid=?");
			query.setParameter(0, kc);
			Kcxx gl=(Kcxx) query.uniqueResult();
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
				Query query = session.createQuery("from Kcxx order by courseid");
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
		public int findKcSize() {
			// TODO Auto-generated method stub
			Session session = getHibernateTemplate().getSessionFactory().openSession();
			try{
				Transaction ts = session.beginTransaction();
				return session.createQuery("from Kcxx").list().size();
			}catch(Exception e){
				e.printStackTrace();
				return 0;
			}finally{
				session.close();
			}
		}
		//删
		@Override
		public void delete(Integer courseid) {
			// TODO Auto-generated method stub
			try{
				Session session =getHibernateTemplate().getSessionFactory().openSession();
				Transaction ts = session.beginTransaction();
				Kcxx kc = find(courseid);
				session.delete(kc);
				ts.commit();
				session.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		@Override
		public void update(Kcxx kc) {
			// TODO Auto-generated method stub
			try{
				Session session = getHibernateTemplate().getSessionFactory().openSession();
				Transaction ts = session.beginTransaction();
				session.update(kc);
				ts.commit();
				session.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public List findCourse(String kc,int pageNow,int pageSize) {
			// TODO Auto-generated method stub
			try{
				Session session = getHibernateTemplate().getSessionFactory().openSession();
				Transaction ts = session.beginTransaction();
				Query query = session.createQuery("from Kcxx  where coursename=?");
				query.setParameter(0, kc);
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
