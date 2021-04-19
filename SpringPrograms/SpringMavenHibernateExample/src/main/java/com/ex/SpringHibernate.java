package com.ex;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ex.Employee;

public class SpringHibernate {
	SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void saveEmployee(Employee e) {
		Session se = sessionFactory.openSession();
		Transaction tx = se.beginTransaction();
		se.save(e);
		tx.commit();
	}
}
