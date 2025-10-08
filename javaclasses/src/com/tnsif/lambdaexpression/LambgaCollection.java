package com.tnsif.lambdaexpression;

import java.util.ArrayList;

public class LambgaCollection {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<>();
		l.add(101);
		l.add(102);
		l.add(103);
		l.add(104);
		
		l.forEach(n->System.out.println(n));

	}

}
