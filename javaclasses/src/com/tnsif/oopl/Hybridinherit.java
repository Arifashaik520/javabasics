package com.tnsif.oopl;

class Animal3{
	void eat() {
		System.out.println("Animal is eating....");
	}
}
class Dog3 extends Animal3{
	void bark() {
		System.out.println("Dog is barking....");
	}
}
class Cat1 extends Animal3{
	void meow() {
		System.out.println("Cat is meowing....");
	}
}
class Puppy1 extends Dog3{
	void weep() {
		System.out.println("Puppy is weeping....");
	}
}
public class Hybridinherit {                      //(hierarchical+multilevel)

	public static void main(String[] args) {
		Puppy1 p=new Puppy1();
		p.eat();
		p.bark();
		p.weep();
		
		Cat1 c=new Cat1();
		c.eat();
		c.meow();
	}

}
