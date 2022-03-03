package com.cg;

public class DriverShape {

	public static void main(String[] args) {
	 
		Circle circle=new Circle("red",true,5.5);
		System.out.println(circle.getArea());
		
		System.out.println(circle.getPerimeter());
		System.out.println(circle);
		
Rectangle rectangle=new Rectangle("black", false, 12, 8);
System.out.println(rectangle.getArea());
System.out.println(rectangle.getPerimeter());

Square square=new Square("prange",true, 10);
System.out.println(square.getArea());
System.out.println(square.getPerimeter());
	}

}
;
