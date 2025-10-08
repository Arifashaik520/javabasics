package com.tnsif.collections;

import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(50);
		ts.add(10);
		ts.add(40);
		ts.add(20);
		System.out.println(ts); // Sorted order

		ts.remove(40);
		System.out.println(ts);

		System.out.println("First: " + ts.first());
		System.out.println("Last: " + ts.last());
	}

}
