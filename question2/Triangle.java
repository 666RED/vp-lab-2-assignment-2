package com.hongchen.question2;

public class Triangle implements Polygon{
	
	private double height;
	private double base;
	private double side1;
	private double side2;
	private double perimeter;
	private double area;
	
	public Triangle(double height, double base, double side1, double side2) {
		setHeight(height);
		setBase(base);
		setSide1(side1);
		setSide2(side2);
		setPerimeter(base + side1 + side2);
		setArea(0.5 * base * height);
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
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getBase() {
		return this.base;
	}
	
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	
	public double getSide1() {
		return this.side1;
	}
	
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	public double getSide2() {
		return this.side2;
	}
}
