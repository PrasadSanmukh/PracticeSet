package com.cg;

public class Circle extends Shape{
private double radius;

public Circle(String colour, boolean filled, double radius) {
	super(colour, filled);
	this.radius = radius;
}

public double getRadius() {
	return radius;
}

public void setRadius(double radius) {
	this.radius = radius;
}

@Override
public String toString() {
	return "Circle [radius=" + radius + "]";
}
public double getArea() {
	return 3.14*radius*radius;
}
public double getPerimeter() {
	return 3.14*2*radius;
}
}
