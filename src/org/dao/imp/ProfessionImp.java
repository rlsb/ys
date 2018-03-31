package org.dao.imp;

import java.util.List;

import org.dao.ProfessionDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Zyxx;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class ProfessionImp  extends HibernateDaoSupport implements ProfessionDao{
	//增
		public void save(Zyxx zy) {
			try{
				Session session =getHibernateTemplate().getSessionFactory().openSession();
				Transaction ts = session.beginTransaction();
				session.save(zy);
				ts.commit();
				session.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		//查
		public Zyxx find(Integer zy) {
			// TODO Auto-generated method stub		
			Session session = getHibernateTemplate().getSessionFactory().openSession();
			Transaction ts = session.beginTransaction();
			System.out.println("1111111");
			Query query=session.createQuery("from Zyxx where professionid=?");
			query.setParameter(0, zy);
			Zyxx gl=(Zyxx) query.uniqueResult();
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
				Query query = session.createQuery("from Zyxx order by professionid");
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
		public int findZySize() {
			// TODO Auto-generated method stub
			Session session = getHibernateTemplate().getSessionFactory().openSession();
			try{
				Transaction ts = session.beginTransaction();
				return session.createQuery("from Zyxx").list().size();
			}catch(Exception e){
				e.printStackTrace();
				return 0;
			}finally{
				session.close();
			}
		}
		//删
		@Override
		public void delete(Integer professionid) {
			// TODO Auto-generated method stub
			try{
				Session session =getHibernateTemplate().getSessionFactory().openSession();
				Transaction ts = session.beginTransaction();
				Zyxx Zy = find(professionid);
				session.delete(Zy);
				ts.commit();
				session.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		@Override
		public void update(Zyxx zy) {
			// TODO Auto-generated method stub
			try{
				Session session = getHibernateTemplate().getSessionFactory().openSession();
				Transaction ts = session.beginTransaction();
				session.update(zy);
				ts.commit();
				session.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public List findProfession(String zy,int pageNow,int pageSize) {
			// TODO Auto-generated method stub
			try{
				Session session = getHibernateTemplate().getSessionFactory().openSession();
				Transaction ts = session.beginTransaction();
				Query query = session.createQuery("from Zyxx  where professionname=?");
				query.setParameter(0, zy);
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
