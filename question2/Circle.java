package com.hongchen.question2;

public class Circle {
	private double radius;
	private double perimeter;
	private double area;
	
	public Circle(double radius) {
		setRadius(radius);
		setArea(Math.PI * radius * radius);
		setPerimeter(2 * Math.PI * radius);
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	public double getPerimeter() {
		return this.perimeter;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public double getArea() {
		return this.area;
	}
}