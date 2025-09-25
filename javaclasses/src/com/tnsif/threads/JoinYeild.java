package com.tnsif.threads;

public class JoinYeild extends Thread {
	public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            // Yield after printing 3
            if (i == 3) {
                System.out.println(Thread.currentThread().getName() + " yielding...");
                Thread.yield();
            }
            try {
                Thread.sleep(500); // slow down execution
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

	
}
