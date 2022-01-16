package com.org.springdemo;

public class HelloWorldService {
	private String name;
	private String address;



	public void setName(String name) {
	this.name = name;
	}



	public void setAddress(String address) {
	this.address = address;
	}
	public String infoData()
	{
	return "Hello"+ name +"you are staying"+address;
	}

}
