package com.org.autotype;

public class AOneClass {
	//instance of boneclass
	BOneClass b; //lets suppose this String

	public AOneClass() {
		super();
	
		// TODO Auto-generated constructor stub
		System.out.println("Class A");
	}
	public void setB(BOneClass b) {
		this.b=b;
	}
	
	public BOneClass getGet() {
		return b;
	}
	
	void PrintName() {
		System.out.println("Hello AoneClass");
	}
	public void display() {
		PrintName(); //AoneClass method
		b.PrintName();// boneclass method
	}
	
	
}
