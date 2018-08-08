package com.test.java.section4;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.List;

public class StreamBasic {
	public static void main(String... args) {
		List<String> dishNames = Dish.menu.stream()
				.sorted(comparing(Dish::getCalories)).map(Dish::getName)
				.collect(toList());

		System.out.println(dishNames);

		List<String> nullList = null;
		// throws NullPointException, need to add null check before use stream
		nullList.stream();
	}
}
