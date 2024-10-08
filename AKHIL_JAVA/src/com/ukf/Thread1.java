package com.ukf;

public class Thread1 extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i+"-"+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		Thread1 thread1= new Thread1();
		thread1.start();
		
		Thread1 thread2=new Thread1();
		thread2.start();
	}
}
