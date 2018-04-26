package com.infotech.client;

import com.infotech.model.Circle;
import com.infotech.model.Shape;
import com.infotech.model.Square;

public class ClientTest {

	public static void main(String[] args) {
		Shape shape;
		Square square = new Square(5.0);
		Circle circle = new Circle(5.0);
		// shape dynamically bound to the Square object referenced by square
		shape = square;
		
		// area method of the square called
		shape.area();
		
		// shape dynamically bound to the Circle object referenced by circle
		shape = circle;
		// area method of the circle called
		shape.area();
	}
}