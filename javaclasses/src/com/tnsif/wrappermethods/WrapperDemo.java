package com.tnsif.wrappermethods;

public class WrapperDemo {

	public static void main(String[] args) {
		        // ===== AUT0BOXING =====
		        byte b = 10;
		        Byte bObj = b; // byte -> Byte
		        System.out.println("Autoboxed Byte: " + bObj);

		        short s = 20;
		        Short sObj = s; // short -> Short
		        System.out.println("Autoboxed Short: " + sObj);

		        int i = 30;
		        Integer iObj = i;  // int -> Integer
		        System.out.println("Autoboxed Integer: " + iObj);

		        long l = 40L;
		        Long lObj = l; // long -> Long
		        System.out.println("Autoboxed Long: " + lObj);

		        float f = 50.5f;
		        Float fObj = f; // float -> Float
		        System.out.println("Autoboxed Float: " + fObj);

		        double d = 60.60;
		        Double dObj = d; // double -> Double
		        System.out.println("Autoboxed Double: " + dObj);

		        char c = 'A';
		        Character cObj = c; // char -> Character
		        System.out.println("Autoboxed Character: " + cObj);

		        boolean bool = true;
		        Boolean blObj = bool; // boolean -> Boolean
		        System.out.println("Autoboxed Boolean: " + blObj);


		        // ===== AUTO-UNBOXING =====
		        Byte bObj2 = 100;
		        byte b2 = bObj2;  // Byte -> byte
		        System.out.println("\nAuto-unboxed byte: " + b2);

		        Short sObj2 = 200;
		        short s2 = sObj2; // Short -> short
		        System.out.println("Auto-unboxed short: " + s2);

		        Integer iObj2 = 300;
		        int i2 = iObj2; // Integer -> int
		        System.out.println("Auto-unboxed int: " + i2);

		        Long lObj2 = 400L;
		        long l2 = lObj2; // Long -> long
		        System.out.println("Auto-unboxed long: " + l2);

		        Float fObj2 = 123.45f;
		        float f2 = fObj2; // Float -> float
		        System.out.println("Auto-unboxed float: " + f2);

		        Double dObj2 = 678.90;
		        double d2 = dObj2; // Double -> double
		        System.out.println("Auto-unboxed double: " + d2);

		        Character cObj2 = 'Z';
		        char c2 = cObj2; // Character -> char
		        System.out.println("Auto-unboxed char: " + c2);

		        Boolean blObj2 = Boolean.FALSE;
		        boolean bool2 = blObj2; // Boolean -> boolean
		        System.out.println("Auto-unboxed boolean: " + bool2);
		    }
		}