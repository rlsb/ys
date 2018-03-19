package org.dao.imp;

import java.util.List;

import org.dao.LoginDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.model.Login;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;



public class LoginImp extends HibernateDaoSupport   implements LoginDao {

	public boolean existXh(String username) {
//		List list=getHibernateTemplate().find("from login where username=?",username);
//		if(list.size()>0)
//			return true;
//		else 
			return false;
	}

	public Login find(String username, String password) {
	try {
		Session session=getHibernateTemplate().getSessionFactory().openSession();
		Transaction ts=session.beginTransaction();
		
		Query query=session.createQuery("from  Login where username=? and password=?");
		query.setParameter(0, username);
		query.setParameter(1, password);
		query.setMaxResults(1);
		
		Login lo=(Login) query.uniqueResult();
		//System.out.println(lo.getUsername()+"  "+lo.getPassword());
		ts.commit();
		session.close();
		if (lo!=null) {
			System.out.println("true");
			return lo;
			
		}else{
			System.out.println("false");
			return null;
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return null;
	}
		
	}
}
