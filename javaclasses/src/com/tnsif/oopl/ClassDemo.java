package com.tnsif.oopl;

class Sample{
	int a=10;
	boolean b=true;
	public void show() {
		System.out.println("This is a show method");
	}
	
}

public class ClassDemo {

	public static void main(String[] args) {
		Sample s=new Sample();
		System.out.println(s.a);
		System.out.println(s.b);
		s.show();

	}

}
