package com.tnsif.wrappermethods;

public class WrapperDemo {

	public static void main(String[] args) {
		        // byte -> Byte
		        byte b = 10;
		        Byte byteObj = Byte.valueOf(b);
		        System.out.println("Byte value: " + byteObj);
		       
		        // short -> Short
		        short s = 20;
		        Short shortObj = Short.valueOf(s);
		        System.out.println("\nShort value: " + shortObj);
		        
		        // int -> Integer
		        int i = 100;
		        Integer intObj = Integer.valueOf(i);
		        System.out.println("\nInteger value: " + intObj);
		       

		        // long -> Long
		        long l = 1000L;
		        Long longObj = Long.valueOf(l);
		        System.out.println("\nLong value: " + longObj);
		      
		        // float -> Float
		        float f = 12.34f;
		        Float floatObj = Float.valueOf(f);
		        System.out.println("\nFloat value: " + floatObj);

		        // double -> Double
		        double d = 123.456;
		        Double doubleObj = Double.valueOf(d);
		        System.out.println("\nDouble value: " + doubleObj);

		        // char -> Character
		        char c = 'A';
		        Character charObj = Character.valueOf(c);
		        System.out.println("\nCharacter value: " + charObj);
		     

		        // boolean -> Boolean
		        boolean bool = true;
		        Boolean boolObj = Boolean.valueOf(bool);
		        System.out.println("\nBoolean value: " + boolObj);
	}

}
