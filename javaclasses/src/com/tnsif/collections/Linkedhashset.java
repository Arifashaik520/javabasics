package com.tnsif.collections;

import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(11);
		lhs.add(22);
		lhs.add(33);
		lhs.add(11); // Duplicate ignored
		System.out.println(lhs); // Maintains insertion order

		lhs.remove(22);
		System.out.println(lhs);

		System.out.println("Is 33 present? " + lhs.contains(33));
	}

}
