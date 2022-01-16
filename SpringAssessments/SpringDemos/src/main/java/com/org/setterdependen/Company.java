package com.org.setterdependen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company implements Department{
	private Department dept;
	//setter based dependency
	@Autowired
	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public void showDepartmentInfo() {
		// TODO Auto-generated method stub
		dept.showDepartmentInfo();
	}
	
}
