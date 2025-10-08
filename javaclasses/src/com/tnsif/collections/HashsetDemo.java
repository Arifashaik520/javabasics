package com.tnsif.collections;

import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Red");
		hs.add("Blue");
		hs.add("Green");
		hs.add("Red"); // Duplicate ignored
		System.out.println(hs);

		hs.remove("Blue");
		System.out.println(hs);

		System.out.println("Contains 'Green'? " + hs.contains("Green"));
	}

}
