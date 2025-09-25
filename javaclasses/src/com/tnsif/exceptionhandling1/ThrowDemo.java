package com.tnsif.exceptionhandling1;

public class ThrowDemo {

	public static void main(String[] args) {
		int age=4;
		if(age<18)
			throw new ArithmeticException("Not Eligible");
		else
			System.out.println("Eligible");

	}

}
