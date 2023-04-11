package com.hongchen.question1;

public class Van extends Vehicle{
	
	public Van(int seater, int wheel, int door, String model, double price) {
		setSeater(seater);
		setWheel(wheel);
		setDoor(door);
		setModel(model);
		setPrice(price);
	}
	
	public void addFuel() {
		System.out.println("The fuel is added for the van");
	}
}
