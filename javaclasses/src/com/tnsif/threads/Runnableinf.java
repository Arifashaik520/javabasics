package com.tnsif.threads;

public class Runnableinf implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=10;i++)
		{
			try 
			{
				System.out.println("Hello");
				Thread.sleep(2000);
			}catch(Exception e) 
			{
				System.out.println(e);
			}
		}
		
	}
	

}
