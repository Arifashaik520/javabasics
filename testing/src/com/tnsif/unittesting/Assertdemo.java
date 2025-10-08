package com.tnsif.unittesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class Assertdemo {
    @Test
	void testAssertTrue(){
		assertTrue("Hello".contains("e"));	
	}
    
    @Test
    void assertEqualsMethod() {
    	int x=1;
    	int y=1;
    	assertEquals(x,y);
    }
    
    void testNull() {
    	String s= null;
    	assertNull(s);
    }
}
