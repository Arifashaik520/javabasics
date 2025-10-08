package com.tnsif.lambdaexpression;

public class Parademo {

	public static void main(String[] args) {
		Withpara w=(a)->
		{
			System.out.println("The value of a is:" +a);
			return a;	
		};
		w.hello(10);

	}

}
