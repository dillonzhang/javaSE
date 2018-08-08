package com.test.java.section5;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.java.section4.Dish;

public class DishTest {
	public static void main(String... args) {
		Dish.menu.stream().map(Dish::getCalories).reduce(0, Integer::sum);
		Dish.menu.stream().mapToInt(Dish::getCalories).sum();

		IntStream intStream = Dish.menu.stream().mapToInt(Dish::getCalories);
		Stream<Integer> stream = intStream.boxed();

		OptionalInt maxCalories = Dish.menu.stream()
				.mapToInt(Dish::getCalories).max();
		int max = maxCalories.orElse(1);

		Stream<String> strStream = Stream.of("Java 8 ", "Lambdas ", "In ",
				"Action");
		strStream.map(String::toUpperCase).forEach(System.out::println);
	}
}
