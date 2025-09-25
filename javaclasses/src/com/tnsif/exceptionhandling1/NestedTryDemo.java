package com.tnsif.exceptionhandling1;

public class NestedTryDemo {

	public static void main(String[] args) {
		try {
			try {
				String n=null;
				System.out.println(n.length());
			}catch(Exception e) {
				System.out.println("The null values can't be read");
			}finally {
				System.out.println("This is nested try,executed succesfully");
			}
		}catch(Exception e) {
			System.out.println("This is outer catch");
		}

	}

}
