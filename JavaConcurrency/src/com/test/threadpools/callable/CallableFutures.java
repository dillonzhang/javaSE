package com.test.threadpools.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutures {

	public static void main(String... args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		List<Future<Long>> list = new ArrayList<Future<Long>>();

		for (int i = 0; i < 20000; i++) {
			Callable<Long> worker = new MyCallable();
			Future<Long> submit = executor.submit(worker);
			list.add(submit);
		}

		long sum = 0;
		System.out.println(list.size());

		for (Future<Long> future : list) {
			try {
				sum += future.get();
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}

		System.out.println(sum);
		executor.shutdown();
	}
}
