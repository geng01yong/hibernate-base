package cn.itcast.hibernatetest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import cn.itcast.entity.User;

/**
 * @author gengyong.top
 *
 */
public class HibernateTest {
	/**
	 * 
	 */
	@Test
	public void testAdd() {
		Configuration cfg=new Configuration().configure("/hibernate.cgf.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		User user=new User();
		user.setUsername("小王");
		user.setPassword("250");
		user.setAddress("日本");
		session.save(user);
		
		tx.commit();
		session.close();
		sessionFactory.close();
		
	}

}
