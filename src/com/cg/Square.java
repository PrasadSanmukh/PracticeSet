package com.cg;

public class Square extends Shape{
private double side;

public Square(String colour, boolean filled, double side) {
	super(colour, filled);
	this.side = side;
}

public double getSide() {
	return side;
}

public void setSide(double side) {
	this.side = side;
}

@Override
public String toString() {
	return "Square [side=" + side + "]";
}

public double getArea() {
	 
	return side*side;
}

public double getPerimeter() {
	 
	return 2*side;
}

}
