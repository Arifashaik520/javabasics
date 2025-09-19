package com.tnsif.interfaces;

public interface Inf1 {
	void call();
	void sms();
}
class jio implements Inf1{
	public void call() {
		System.out.println("Calling from Jio..");
	}
	public void sms() {
		System.out.println("Message sent from jio...");
	}
}
class Samsung implements Inf1{
	public void call() {
		System.out.println("Calling from Samsung..");
	}
	public void sms() {
		System.out.println("Message sent from Samsung...");
	}
}

