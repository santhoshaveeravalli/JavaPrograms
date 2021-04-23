package com.springhibernate;
import org.hibernate.*;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class SpringHibernate {
	
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public void saveEmployee(Employee e) {
		
		hibernateTemplate.save(e);
	}
	/*SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void saveEmployee(Employee e) {
		Session se = sessionFactory.openSession();
		Transaction tx = se.beginTransaction();
		se.save(e);
		tx.commit();
	}*/

}

