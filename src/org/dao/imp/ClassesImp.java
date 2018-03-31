package org.dao.imp;

import java.util.List;

import org.dao.ClassesDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Bjxx;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class ClassesImp  extends HibernateDaoSupport implements ClassesDao{
	//增
		public void save(Bjxx bj) {
			try{
				Session session =getHibernateTemplate().getSessionFactory().openSession();
				Transaction ts = session.beginTransaction();
				session.save(bj);
				ts.commit();
				session.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		//查
		public Bjxx find(Integer bj) {
			// TODO Auto-generated method stub		
			Session session = getHibernateTemplate().getSessionFactory().openSession();
			Transaction ts = session.beginTransaction();
			System.out.println("1111111");
			Query query=session.createQuery("from Bjxx where classid=?");
			query.setParameter(0, bj);
			Bjxx gl=(Bjxx) query.uniqueResult();
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
				Query query = session.createQuery("from Bjxx order by classid");
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
		public int findBjSize() {
			// TODO Auto-generated method stub
			Session session = getHibernateTemplate().getSessionFactory().openSession();
			try{
				Transaction ts = session.beginTransaction();
				return session.createQuery("from Bjxx").list().size();
			}catch(Exception e){
				e.printStackTrace();
				return 0;
			}finally{
				session.close();
			}
		}
		//删
		@Override
		public void delete(Integer classid) {
			// TODO Auto-generated method stub
			try{
				Session session =getHibernateTemplate().getSessionFactory().openSession();
				Transaction ts = session.beginTransaction();
				Bjxx bj = find(classid);
				session.delete(bj);
				ts.commit();
				session.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		@Override
		public void update(Bjxx bj) {
			// TODO Auto-generated method stub
			try{
				Session session = getHibernateTemplate().getSessionFactory().openSession();
				Transaction ts = session.beginTransaction();
				session.update(bj);
				ts.commit();
				session.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public List findClasses(String bj,int pageNow,int pageSize) {
			// TODO Auto-generated method stub
			try{
				Session session = getHibernateTemplate().getSessionFactory().openSession();
				Transaction ts = session.beginTransaction();
				Query query = session.createQuery("from Bjxx  where classname=?");
				query.setParameter(0, bj);
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
