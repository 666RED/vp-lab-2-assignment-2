package com.hongchen.question1;

public abstract class Vehicle {
	private int seater;
	private int wheel;
	private int door;
	private String model;
	private double price;
	
	public void setSeater(int seater) {
		this.seater = seater;
	}
	
	public int getSeater() {
		return this.seater;
	}
	
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	public int getWheel() {
		return this.wheel;
	}
	
	public void setDoor(int door) {
		this.door = door;
	}
	
	public int getDoor() {
		return this.door;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public abstract void addFuel();
}
