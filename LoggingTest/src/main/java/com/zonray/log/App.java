package com.zonray.log;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	static Logger logger = org.apache.log4j.Logger.getLogger(App.class.getName());
	
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		logger.info("****************  Logegr.....Container created..  ****************");
		logger.info(container);
		Employee employee = container.getBean(Employee.class);
		System.out.println(employee);
		logger.info("************   bean details fetched **********************");
		ClassPathXmlApplicationContext.class.cast(container).close();
	}
}
