package com.maven.DemoSpring;



public class Dev {
	
	private Computer com;
//	private int age;
	
	
	public Dev()
	{
		System.out.println("Dev Constructor");
	}
	
	
//	public Dev(Laptop laptop) {
//		super();
//		this.laptop = laptop;
//		System.out.println("Dev 1 Constructor");
//	}


//	public int getAge() {
//		return age;
//	}
//
//
//	public void setAge(int age) {
//		this.age = age;
//	}


//	public void getLaptop() {
//		return laptop;
//	}
//
//
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}


	public Computer getCom() {
		return com;
	}


	public void setCom(Computer com) {
		this.com = com;
	}


	public void build() {
		
		System.out.println("Working on my Spring Project!!");
		com.compile();
	}
}

