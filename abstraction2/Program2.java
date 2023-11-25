package com.kn.abstraction2;

public class Program2 extends Program 
{
	public void m3()
	{
		System.out.println("abstract method in parent class as overriden");
	}
	
//Constructor
	public Program2()
	{
		super();
		System.out.println("Child class constructor");
	}

	
}
