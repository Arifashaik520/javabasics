package com.tnsif.arrays_Strings;

public class Jaggedarray {

	public static void main(String[] args) {
		int[][] a1= {{1,2,3,4},{5,6},{7,8,9}};
		for(int x[]:a1) {
			for(int y:x) {
				System.out.print(y+" ");	
			}
			System.out.println();
		}
		


	}

}
