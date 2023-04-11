package com.hongchen.question1;

public class MyMainClass {

	public static void main(String[] args) {
		Car car = new Car(5, 4, 4, "Proton Saga", 20000.00);
		Van van = new Van(8, 4, 3, "Nissan NV200", 40000.00);
		
		System.out.println("Information of the car: ");
		System.out.println("Seater\t: " + car.getSeater());
		System.out.println("Wheel\t: " + car.getWheel());
		System.out.println("Door\t: " + car.getDoor());
		System.out.println("Model\t: " + car.getModel());
		System.out.println("Price\t: RM " + car.getPrice());
		car.addFuel();
		
		System.out.println("\nInformation of the van: ");
		System.out.println("Seater\t: " + van.getSeater());
		System.out.println("Wheel\t: " + van.getWheel());
		System.out.println("Door\t: " + van.getDoor());
		System.out.println("Model\t: " + van.getModel());
		System.out.println("Price\t: RM " + van.getPrice());
		van.addFuel();
	}

}
