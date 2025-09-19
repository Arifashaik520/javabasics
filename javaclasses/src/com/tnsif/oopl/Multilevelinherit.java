package com.tnsif.oopl;

class Animal1{
	void eat() {
		System.out.println("Animal is eating....");
	}
}
class Dog1 extends Animal1{
	void bark() {
		System.out.println("Dog is barking....");
	}
}
class Puppy extends Dog1{
	void weep() {
		System.out.println("Puppy is weeping....");
	}
}
public class Multilevelinherit {

	public static void main(String[] args) {
		Puppy p=new Puppy();
		p.eat();
		p.bark();
		p.weep();
	}

}
