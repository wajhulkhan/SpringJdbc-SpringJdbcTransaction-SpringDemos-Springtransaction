package com.org.autowiring;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class FictionWriter implements Writer {
	
	@Autowired
	private Award award;
	
	@Autowired
	public void printAward(Award award) {
		this.award=award;
	}


	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Write fiction Novels");
	}

	
	public void getAward() {
		// TODO Auto-generated method stub
		award.award();
		
	}

	
}
