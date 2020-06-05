package com.meenu.codingskills.thirtydaysofcode;
/**
* @author Meenu V. Nair
*
 * Creation time: Jun 5, 2020 12:21:47 PM
*
*/

public class MultiThreading {
	private static String resource1 = "Resource 1";
	private static String resource2 = "Resource 2";

	public static void main(String ars[]) {
		
		System.out.println("Main thread executing....");
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1 locked Resource 1");
					try {
						Thread.sleep(100);
					}catch(InterruptedException e) {}
					
					synchronized (resource2) {
						System.out.println("Thread 1 locked Resource 2");	
					}
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread 2 locked Resource 2");
					try {
						Thread.sleep(100);
					}catch(InterruptedException e) {}
					synchronized (resource1) {
						System.out.println("Thread 2 locked Resource 1");	
					}
				}
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main thread completed");
	}

}
