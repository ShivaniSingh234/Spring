package com.maven.DemoSpring;

public class Laptop implements Computer {
	public Laptop()
	{
		System.out.println("Laptop Constructor");
	}
	public void compile()
	{
		System.out.println("compiling in Laptop");
	}
	
}
