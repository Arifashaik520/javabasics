package com.tnsif.threads;

public class Rundemo {

	public static void main(String[] args) {
		Runnableinf rn=new Runnableinf();
		Thread t1=new Thread(rn);
		t1.start();

	}

}
