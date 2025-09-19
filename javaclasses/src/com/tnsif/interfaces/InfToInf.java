package com.tnsif.interfaces;

public class InfToInf {

	public static void main(String[] args) {
		 Pet myDog = new Dog();   // Reference of Pet interface
	        myDog.eat();   // From Animal interface
	        myDog.play();  // From Pet interface
	}

}
