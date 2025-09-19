package com.tnsif.oopl;

class Animal2{
	void eat() {
		System.out.println("Animal is eating....");
	}
}
class Dog2 extends Animal2{
	void bark() {
		System.out.println("Dog is barking....");
	}
}
class Cat extends Animal2{
	void meow() {
		System.out.println("Cat is meowing....");
	}
}

public class Hierarchicalinherit {

	public static void main(String[] args) {
		Dog2 d=new Dog2();
		d.eat();
		d.bark();
		Cat c=new Cat();
		c.eat();
		c.meow();

	}

}
