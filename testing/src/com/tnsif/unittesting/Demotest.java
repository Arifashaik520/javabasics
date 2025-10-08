package com.tnsif.unittesting;

import org.junit.Ignore;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Demotest {
	@RepeatedTest(2)
	@Test
	public void Show() {
		System.out.println("This is Show method");
	}
	
	@Ignore
	void sayHii() {
		System.out.println("This is Hii method");
	}
	
	@Test
	void hello() {
		System.out.println("This is hello method");
	}

}
