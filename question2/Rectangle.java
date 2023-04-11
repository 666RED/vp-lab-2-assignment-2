package com.hongchen.question2;

public class Rectangle implements Polygon{
	
	private double length;
	private double width;
	private double perimeter;
	private double area;
	
	public Rectangle(double length, double width) {
		setLength(length);
		setWidth(width);
		setPerimeter((2 * length) + (2 * width));
		setArea(length * width);
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
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return this.width;
	}
}
