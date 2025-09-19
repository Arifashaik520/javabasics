package com.tnsif.constructors;

class Students{
	String name;
	int age;
	Students(String n,int a){
		name=n;
		age=a;
	}
	void display() {
		System.out.println(name+"-"+age);
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		Students s1=new Students("Arun",20);
		Students s2=new Students("Divya",22);
		
		s1.display();
		s2.display();

	}

}
