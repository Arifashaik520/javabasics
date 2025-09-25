package com.tnsif.arraysStrings1;

public class Matrixarray {

	public static void main(String[] args) {
		int[][] array=new int[3][4];
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				array[i][j]=(int)(Math.random()*10);
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}

	}


	}

