package com.org.setterdependen;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
		Company c = con.getBean(Company.class);
		
		c.showDepartmentInfo();
		con.close();
	}

}
