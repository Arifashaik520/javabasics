package com.tnsif.collections;

public class GenericDemo {

	public static void main(String[] args) {
		Generic<Integer> g=new Generic<Integer>();
		g.setData(201);
		g.setData(202);
		System.out.println(g.getData());
		
		Generic<String> g1=new Generic<String>();
		g1.setData("TNS");
		System.out.println(g1.getData());
		
		

	}

}
