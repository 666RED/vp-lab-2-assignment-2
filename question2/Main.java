package com.hongchen.question2;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		Rectangle rectangle = new Rectangle(3, 4);
		Triangle triangle = new Triangle(4, 6, 3, 2);
		
		System.out.println("The information of circle: ");
		System.out.printf("Radius\t : %.2f\n", circle.getRadius());
		System.out.printf("Perimeter: %.2f\n", circle.getPerimeter());
		System.out.printf("Area\t : %.2f\n", circle.getArea());
		
		System.out.println("\nThe information of rectangle: ");
		System.out.printf("Length\t : %.2f\n", rectangle.getLength());
		System.out.printf("Width\t : %.2f\n", rectangle.getWidth());
		System.out.printf("Perimeter: %.2f\n", rectangle.getPerimeter());
		System.out.printf("Area\t : %.2f\n", rectangle.getArea());
		
		System.out.println("\nThe information of triangle: ");
		System.out.printf("Height\t : %.2f\n", triangle.getHeight());
		System.out.printf("Base\t : %.2f\n", triangle.getBase());
		System.out.printf("Side 1\t : %.2f\n", triangle.getSide1());
		System.out.printf("Side 2\t : %.2f\n", triangle.getSide2());
		System.out.printf("Perimeter: %.2f\n", triangle.getPerimeter());
		System.out.printf("Area\t : %.2f\n", triangle.getArea());
	}

}
