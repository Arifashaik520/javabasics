package com.tnsif.acessmodifiers;

public class PrivateDemo {
	private int data=10;
	private void show() {
		System.out.println("Private Method");//Here "data" & "show()" can only used inside PrivateDemo class,not accessible outside the class
		}

}
