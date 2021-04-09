package com.springcollection;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

            Resource rs = new ClassPathResource("spring.xml");
            BeanFactory bm = new XmlBeanFactory(rs);
            Mobile m = (Mobile) bm.getBean("santu");
            System.out.println(m.getMobiletype());
            List s = m.getMobileCompany();
            Iterator<List> i = s.iterator();
            while(i.hasNext()) {
            	System.out.println(i.next());
            }
	}

}
