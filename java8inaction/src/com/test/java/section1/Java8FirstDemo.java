package com.test.java.section1;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Java8FirstDemo {
	public static void main(String... args) {

		List<Apple> inventory = Arrays.asList(new Apple(80, "green"),
				new Apple(155, "green"), new Apple(120, "red"));

		List<Apple> test1 = AppleUtils.filterApples(inventory,
				AppleUtils::isGreenApple);
		System.out.println(test1);

		List<Apple> test2 = AppleUtils.filterApplesFromStream(inventory,
				AppleUtils::isHeavyApple);
		System.out.println(test2);

		List<Apple> test3 = AppleUtils.filterApplesFromStream(inventory,
				a -> a.getWeight() > 70);
		System.out.println(test3);

		List<Apple> test4 = AppleUtils.filterApplesFromStream(
				inventory,
				a -> a.getWeight() > 70
						&& "green".equalsIgnoreCase(a.getColor()));
		System.out.println(test4);

		List<Apple> test5 = AppleUtils.filterApplesFromStream(inventory, (
				Apple a) -> a.getWeight() > 70);
		System.out.println(test5);
		
		File[] hiddleFiles = new File(".").listFiles(File::isHidden);
	}

}
