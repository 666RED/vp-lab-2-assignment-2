package com.hongchen.question1;

public class Car extends Vehicle{
	
	public Car(int seater, int wheel, int door, String model, double price) {
		setSeater(seater);
		setWheel(wheel);
		setDoor(door);
		setModel(model);
		setPrice(price);
	}
	
	public void addFuel() {
		System.out.println("The fuel is added for the car");
	}
}
