package com.sac.multithreadingEnhancements;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable {
	String name;

	PrintJob(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + "...Job started by Thread:" + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + "...Job completed by Thread:" + Thread.currentThread().getName());
	}

}

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		PrintJob[] jobs = { new PrintJob("SACHIN"), 
				new PrintJob("SONU"), 
				new PrintJob("BAWA"), 
				new PrintJob("VIPIN"),
				new PrintJob("YASHI"), 
				new PrintJob("SAMY") };
		/*
		 * By using below ExecutorService we can define thread pool with no. of
		 * threads in the pool.
		 * In this example 3 threads are responsible to execute 6 jobs so that 
		 * a single thread can be reused for multiple
		 * jobs.
		 */
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (PrintJob job :jobs){
			service.submit(job);
		}
		service.shutdown();
	}

}
