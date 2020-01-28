package com.ragu.spring.core.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class SpringCoreDemo {

	public static void main(String[] args) {
		
		Supervisor s1 = new Supervisor(101, "m", "h", 40000);
		System.out.println(s1);
		
//		SupervisorCRUD crud = new SupervisorCRUD();
//		crud.createSupervisor();
		
		System.out.println("*****************");
		
		Resource res = new ClassPathResource("ragu.xml");
		BeanFactory beanFactory = new XmlBeanFactory(res);
		
		SupervisorCRUD springCrud = (SupervisorCRUD) beanFactory.getBean("supObj");
		springCrud.createSupervisor();
		
		System.out.println(springCrud);
		
	}

}
