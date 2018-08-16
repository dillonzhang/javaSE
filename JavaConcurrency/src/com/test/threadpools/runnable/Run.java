package com.test.threadpools.runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 500; i++) {
			Runnable worker = new MyRunnable(100000L + i);
			executor.execute(worker);
		}

		executor.shutdown();
		executor.awaitTermination(1000, TimeUnit.MINUTES);

		System.out.println("Finish all threads");
	}

}
