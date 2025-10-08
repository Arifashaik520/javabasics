package com.tnsif.streamapiprograms;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<>();
		nums.add(5);
		nums.add(2);
		nums.add(8);
		nums.add(3);
		nums.add(2);
		
		System.out.println("Orginal List:"+nums);
		
		System.out.println("\n Processed Stream Output");
		
		nums.stream()
		.distinct()//removes duplicate values
		.sorted()//sorts the elements in ascending order
		.skip(1)//skips first 1 element
		.limit(3)//takes next 3 elements after skipping
		.forEach(System.out::println);//terminal operation prints each element

	}

}
