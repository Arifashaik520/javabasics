package com.tnsif.oopl;

abstract class Shape{
	int area;
	
	abstract void calArea();
	
	void show() 
	{
		System.out.println("The area is "+ area);
	}
}
class Square extends Shape{
	int side;
	
	Square(int side)
	{
		this.side=side;
	}
	
	void calArea()
	{
		area=side*side;
	}
}
class Rectangle extends Shape{
	int length,breadth;
	
	Rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
	
	void calArea() 
	{
		area=length*breadth;
	}
}
public class AbstractionExp {

	public static void main(String[] args) 
	{
		Square sq=new Square(5);
		sq.calArea();
		sq.show();
		
		Rectangle re=new Rectangle(4,6);
		re.calArea();
		re.show();

	}

}
