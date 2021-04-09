package com.ex;

import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {

	public static void main(String[] args) {
            Resource rs = new ClassPathResource("spring.xml");
            BeanFactory bm = new XmlBeanFactory(rs);
            Employee emp = (Employee) bm.getBean("santu");
            System.out.println(emp.getEid()+" "+emp.getEname());
            Set s = emp.getDept();
            Iterator i = s.iterator();
            while(i.hasNext()) {
            	System.out.println(i.next());
            }
	}

}
