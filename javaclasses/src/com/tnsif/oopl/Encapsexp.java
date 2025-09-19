package com.tnsif.oopl;

class Car{
	String color;
	String model;
	String company;
	public void moving() {
		System.out.println("Car is Moving.....");
	}
	public void stopping() {
		System.out.println("Car has stopped.....");
	}
	public void drifting() {
		System.out.println("Car is Drifting.....");
	}
	public void ShowDetails() {
		System.out.println("Car Details:");
		System.out.println("Color:"+ color);
		System.out.println("Model:"+ model);
		System.out.println("Company:"+ company);
		
	}
	
}

public class Encapsexp {

	public static void main(String[] args) {
		Car c=new Car();
		
		c.color="Blue";
		c.model="i20";;
		c.company="Hyundai";
		
		c.ShowDetails();
		c.moving();
		c.stopping();
		c.drifting();

	}

}
