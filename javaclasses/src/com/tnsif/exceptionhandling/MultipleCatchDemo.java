package com.tnsif.exceptionhandling;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());	
		}catch(ArithmeticException e) {
			System.out.println("Division by zero not possible");
		}
		catch(NullPointerException e) {
			System.out.println("The null values can't be read");
		}
         catch(ArrayIndexOutOfBoundsException e) {
        	    System.out.println("Index not found");
		}

	}

}
