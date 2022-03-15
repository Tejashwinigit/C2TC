package com.teju.path.hib.Main;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.teju.path.hib.admin;

public class HyberMain {

	private static Object sessionFctory;

	public static void main(String[] args) {
		
		admin a= new admin(0, null);
		a.setAdminId(1);
		a.setAdminName("teju");
		
		SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();
		Session session =  sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(a);
		session.getTransaction().commit();
		
		
				
				

	}

}
