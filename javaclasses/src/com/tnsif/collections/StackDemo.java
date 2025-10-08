package com.tnsif.collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s);

		s.pop();
		System.out.println("After pop: " + s);

		s.push(40);
		System.out.println(s);

		System.out.println("Top element: " + s.peek());
		System.out.println("Is stack empty? " + s.empty());
	}

}
