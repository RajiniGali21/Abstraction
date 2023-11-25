package com.kn.abstraction1;

public abstract class Car 
{

	public void start()
	{
		System.out.println("car has started");
	}
	public void stop()
	{
		System.out.println("car has stopped");
	}
	abstract public void refuel();
//	{
//		System.out.println("refuel is filling....");
//	}
	abstract public void race();
}
