package com.kn.abstraction2;

public abstract class Program
{
// static variable
	static int i;
//	instance variable;
	int j;
//	static block
	 static
	{
		System.out.println("static block ");
		i=10;
	}
//	instance block
	{
		System.out.println("instance block");
		j=20;
		
	}
//	concert static method
	public static void m1()
	{
		System.out.println("concrete static method");
	}
//	concrete instance method
	public  void m2()
	{
		System.out.println("concrete instance method");
	}
//	abstract method
	public abstract void m3();
//	constructor
	public Program()
		{
			System.out.println("Parent class constructor");
		}
//	main method
	public static void main(String[] args) 
	{
	System.out.println("main method");	
	}
//	final method 
	final public void m4()
	{
		System.out.println("final method in abstarct class");
	}
	
	
}
