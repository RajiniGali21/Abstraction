package com.kn.abstraction1;

public class CarDemo {

	public static void main(String[] args) 
	{
		ElectricCar electriccar = new ElectricCar();
		PetrolCar petrolcar = new PetrolCar();
		DieselCar dieselcar = new DieselCar();
		
		System.out.println("**********");
		electriccar.start();
		electriccar.stop();
		electriccar.refuel();
		System.out.println("************");
		petrolcar.start();
		petrolcar.stop();
		petrolcar.refuel();
		System.out.println("**********");
		dieselcar.start();
		dieselcar.stop();
		dieselcar.refuel();
		System.out.println("**********");
	}

}
