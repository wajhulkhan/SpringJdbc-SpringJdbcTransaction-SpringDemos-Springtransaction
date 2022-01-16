package com.org.setterdependen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.org.setterdependen")
public class AppConfig {
	
	@Bean
	public Department getDepartment() {
		return new DepartmentImp1();
	}

}
