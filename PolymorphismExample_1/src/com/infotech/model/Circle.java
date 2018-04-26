package com.infotech.model;

//Child class of Shape
public class Circle extends Shape {
	// constructor to initialize length
	public Circle(double radius) {
		super(radius); // calling the super class constructor
	}

	// Overriding the area() method
	@Override
	public void area() {
		System.out.println("Area of cirlce - " + 22 / 7 * getLength() * getLength());
	}
}
