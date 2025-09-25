package com.tnsif.exceptionhandling1;
import java.io.FileReader;
import java.io.File;

public class CheckedDemo {

	public static void main(String[] args) {
		File fi=new File("abc.txt");
		FileReader fr=new FileReader(fi);
	}

}
