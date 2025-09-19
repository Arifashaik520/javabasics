package com.tnsif.tasks;

public class Palindrome {

	public static void main(String[] args) {
		int num=121;
		int orginal=num;
		int reversed=0;
		while(num>0) {
			int digit=num%10;
			reversed=reversed*10+digit;
			num=num/10;
		}
		if(orginal==reversed) {
			System.out.println(orginal+" is a palindrome");
		}
		else {
			System.out.println(orginal+" is a palindrome");
		}

	}

}
