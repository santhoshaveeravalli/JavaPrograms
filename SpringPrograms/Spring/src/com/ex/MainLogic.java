package com.ex;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {

	public static void main(String[] args) {
Resource res = new ClassPathResource("student.xml");
BeanFactory bn = new XmlBeanFactory(res);
Student rx = (Student)bn.getBean("santhu");
System.out.println(rx.getSid()+" "+rx.getSname()+" "+rx.getMarks());

	}

}
