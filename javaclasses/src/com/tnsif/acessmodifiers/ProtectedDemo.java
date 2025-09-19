package com.tnsif.acessmodifiers;

class Parent{
	protected void display()//accessible in same package and child classes (of different packages)
	{
		System.out.println("Protected Method");
	}
}
public class ProtectedDemo extends Parent{

	public static void main(String[] args) {
		ProtectedDemo obj=new ProtectedDemo();
		obj.display();
		

	}

}
