package com.test.java.section2;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String... args) {

		List<Apple> inventory = Arrays.asList(new Apple(80, "green"),
				new Apple(155, "green"), new Apple(120, "red"));

		AppleUtils.filterApple(inventory, new AppleFilter() {

			@Override
			public boolean filter(Apple apple) {
				return false;
			}
		});

		List<Apple> result = new FilterEverything<Apple>().filter(inventory, (
				Apple a) -> "red".equals(a.getColor()));

		System.out.println(result);

		inventory.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(
				a2.getWeight()));

		new Thread(() -> System.out.println("Hello world"));

		DefaultAppleFilter daf = new DefaultAppleFilter();
		daf.addForAll();
	}
}
