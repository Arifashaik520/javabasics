package com.tnsif.exceptionhandling1;

class Sample{
	public void show() throws Exception{
		String s=null;
		throw new NullPointerException("NoNullValues");
	}
}
public class ThrowsDemo {

	public static void main(String[] args) throws Exception {
		Sample s1=new Sample();
		s1.show();
		

	}

}
