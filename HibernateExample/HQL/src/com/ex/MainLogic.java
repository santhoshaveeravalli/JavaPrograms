package com.ex;

import java.util.Iterator;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class MainLogic {

	public static void main(String[] args)  {
		Configuration cf = new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		
		Transaction tx = se.beginTransaction();
		/*Student deepu = new Student();
		deepu.setSid(934);
		deepu.setSname("Santhu");
		deepu.setMarks(100);
		se.save(deepu);
		*/
		//Query qr=se.createQuery("from Student s where s.sid=?");
		//qr.setParameter(0, 234);
		Query qr = se.getNamedQuery("myselect");
		
		List li = qr.list();
		Iterator i = li.iterator();
		while(i.hasNext()) {
			Student rs = (Student)i.next();
			System.out.println(rs.getSid()+" "+rs.getSname()+" "+rs.getMarks());
		//Object x[] =(Object[])i.next();
		//	System.out.println(x[0]+" "+x[1]+" "+x[2]);
		//	Integer x =(Integer)i.next();
		//	System.out.println(x.intValue());
		}
		
		
		//tx.commit();
		se.close();
	}

}
