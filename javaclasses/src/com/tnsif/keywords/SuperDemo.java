package com.tnsif.keywords;

class Parent{
	void msg() {
		System.out.println("Hello from Parent class");
	}
}
class Child extends Parent{
	void msg() {
		super.msg();
		System.out.println("Hello from Child class");
		
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		Child c=new Child();
		c.msg();

	}

}
