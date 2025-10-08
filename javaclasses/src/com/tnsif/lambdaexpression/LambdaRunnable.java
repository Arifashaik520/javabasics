package com.tnsif.lambdaexpression;

public class LambdaRunnable {

	public static void main(String[] args) {
		Runnable r=()->{
			String str=Thread.currentThread().getName();
			System.out.println(str);
		};
		Thread t=new Thread(r);
		Thread t1=new Thread(r);
		t.start();
		t1.start();
	}

}
