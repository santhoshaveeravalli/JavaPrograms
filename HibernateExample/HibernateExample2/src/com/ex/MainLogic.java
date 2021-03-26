package com.ex;

import java.util.Scanner;
import org.hibernate.*;
import org.hibernate.cfg.*;


public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf = new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
	   	Vehicle vehicleobj = new Vehicle();
	   	Scanner sc = new Scanner(System.in);
	   	
		vehicleobj.setVehicle_id(2000);
	    vehicleobj.setVehicle_name("Rav4");
	    vehicleobj.setManufacturer("Honda");
	    vehicleobj.setPrice(22234);
		session.saveOrUpdate(vehicleobj);
	   	
	   /* vehicleobj.setVehicle_id(1996);
	    vehicleobj.setVehicle_name("Rogue");
	    vehicleobj.setManufacturer("Nissan");
	    vehicleobj.setPrice(33450);
		session.save(vehicleobj);*/
		
	/*  vehicleobj.setVehicle_id(1996);
	    vehicleobj.setVehicle_name("Rogue Sport");
	    vehicleobj.setManufacturer("Nissan");
	    vehicleobj.setPrice(35450);
		session.update(vehicleobj);*/
		
	
	  /* vehicleobj.setVehicle_id(1999);
	    vehicleobj.setVehicle_name("Murrano");
	    vehicleobj.setManufacturer("Nissan");
	    vehicleobj.setPrice(31230);
		session.saveOrUpdate(vehicleobj);*/
		//It will execute select query to check whether the record found or not if it not present then it will execute udpate 
		/*vehicleobj.setVehicle_id(1999);
		session.delete(vehicleobj);*/
	   /* vehicleobj.setVehicle_id(1999);
	    vehicleobj.setVehicle_name("Odyssey");
	    vehicleobj.setManufacturer("Honda");
	    vehicleobj.setPrice(30790);
		session.update(vehicleobj);*/
	  /* 	vehicleobj.setVehicle_id(1992);
	    vehicleobj.setVehicle_name("Passport");
	    vehicleobj.setManufacturer("Honda");
	    vehicleobj.setPrice(31990);
		session.persist(vehicleobj);*/
		tx.commit();
		Vehicle y=(Vehicle)session.get(Vehicle.class,2000);
		System.out.println("\nUsing Get method:\n"+" " +y.getVehicle_id()+" "+y.getVehicle_name()+" "+y.getManufacturer()+" "+y.getPrice()+"\n");
		Vehicle x=(Vehicle)session.load(Vehicle.class,1999);
		System.out.println("\nUsing LOAD method:\n"+" " +x.getVehicle_id()+" "+x.getVehicle_name()+" "+x.getManufacturer()+" "+x.getPrice());
		session.clear();
		session.close();
		

	}

}
