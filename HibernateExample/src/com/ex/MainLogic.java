package com.ex;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class MainLogic {

	public static void main(String[] args)  {
		Configuration cf = new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		
		Transaction tx = se.beginTransaction();
		
		Student santhu= new Student();
		santhu.setSid(1234);
		santhu.setSname("Santhu");
		santhu.setMarks(345);
		
		
		Employee deepu = new Employee();
		deepu.setEmpid(234);
		deepu.setEmpname("Deepu");
		se.save(santhu);
		se.save(deepu);
		
		tx.commit();
		se.close();
	}

}
