package com.org.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Award {
	public void award() {
		System.out.println("You writing got award");
	}

}
