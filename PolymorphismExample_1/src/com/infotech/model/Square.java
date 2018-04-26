package com.infotech.model;

//Child class of Shape
public class Square extends Shape {
	// constructor to initialize length
	public Square(double side) {
		super(side); // calling the super class constructor
	}

	// Overriding the area() method
	@Override
	public void area() {
		System.out.println("Area of square - " + getLength() * getLength());
	}
}