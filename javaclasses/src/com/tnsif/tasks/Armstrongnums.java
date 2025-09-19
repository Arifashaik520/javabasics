package com.tnsif.tasks;

public class Armstrongnums {

	public static void main(String[] args) {
		int n=153;
		int orginal=n;
		int sum=0;
		while(n>0){
			int digit=n%10;
			sum+=Math.pow(digit, 3);
			n=n/10;
		}
		if(sum==orginal) {
			System.out.println(orginal+" is an armstrong number");
		}
		else {
			System.out.println(orginal+"is not an armstrong number");
		}

	}

}
