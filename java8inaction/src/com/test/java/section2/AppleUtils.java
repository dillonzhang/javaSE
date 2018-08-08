package com.test.java.section2;

import java.util.ArrayList;
import java.util.List;

public class AppleUtils {
	public static List<Apple> filterApple(List<Apple> inventory,
			AppleFilter filter) {
		List<Apple> result = new ArrayList<Apple>();

		for (Apple a : inventory) {
			if (filter.filter(a)) {
				result.add(a);
			}
		}

		return result;
	}
}
