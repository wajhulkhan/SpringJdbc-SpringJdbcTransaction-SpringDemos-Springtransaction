package com.org.copy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Writer w = con.getBean( FictionWriter.class);
		w.write();
		w.getAward();
		con.close();
	}

}
