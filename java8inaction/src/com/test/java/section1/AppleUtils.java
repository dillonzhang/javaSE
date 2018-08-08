package com.test.java.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AppleUtils<T> {
	public static List<Apple> filterGreenApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<Apple>();
		for (Apple a : inventory) {
			if ("green".equals(a)) {
				result.add(a);
			}
		}
		return result;
	}

	public static List<Apple> filterHeavyApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<Apple>();
		for (Apple a : inventory) {
			if (a.getWeight() > 150) {
				result.add(a);
			}
		}
		return result;
	}

	public static boolean isGreenApple(Apple apple) {
		return "green".equalsIgnoreCase(apple.getColor());
	}

	public static boolean isHeavyApple(Apple apple) {
		return apple.getWeight() > 150;
	}

	public static List<Apple> filterApples(List<Apple> inventory,
			Predicate<Apple> p) {
		List<Apple> result = new ArrayList<Apple>();
		for (Apple a : inventory) {
			if (p.test(a)) {
				result.add(a);
			}
		}
		return result;
	}

	public static List<Apple> filterApplesFromStream(List<Apple> inventory,
			Predicate<Apple> p) {
		return inventory.stream().filter(p).collect(Collectors.toList());
	}

}
