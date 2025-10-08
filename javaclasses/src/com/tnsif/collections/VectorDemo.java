package com.tnsif.collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("Java");
		v.add("C++");
		v.add("Python");
		System.out.println(v);

		v.remove(1);
		System.out.println(v);

		v.addElement("Kotlin");
		v.add("Go");
		System.out.println(v);

		System.out.println("Element at index 2: " + v.get(2));
		System.out.println("Vector size: " + v.size());
	}

}
