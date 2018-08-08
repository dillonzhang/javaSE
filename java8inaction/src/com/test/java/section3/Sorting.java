package com.test.java.section3;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Sorting {

	public static void main(String... args) {

		// 1
		List<Apple> inventory = new ArrayList<>();
		inventory.addAll(Arrays.asList(new Apple(80, "green"), new Apple(155,
				"green"), new Apple(120, "red")));

		// [Apple{color='green', weight=80}, Apple{color='red', weight=120},
		// Apple{color='green', weight=155}]
		inventory.sort(new AppleComparator());
		System.out.println(inventory);

		// reshuffling things a little
		inventory.set(1, new Apple(30, "green"));

		// 2
		// [Apple{color='green', weight=30}, Apple{color='green', weight=80},
		// Apple{color='green', weight=155}]
		inventory.sort(new Comparator<Apple>() {
			@Override
			public int compare(Apple a1, Apple a2) {
				return a1.getWeight().compareTo(a2.getWeight());
			}
		});
		System.out.println(inventory);

		// reshuffling things a little
		inventory.set(1, new Apple(20, "red"));

		// 3
		// [Apple{color='red', weight=20}, Apple{color='green', weight=30},
		// Apple{color='green', weight=155}]
		inventory.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));
		System.out.println(inventory);

		// reshuffling things a little
		inventory.set(1, new Apple(10, "red"));

		// 4
		// [Apple{color='red', weight=10}, Apple{color='red', weight=20},
		// Apple{color='green', weight=155}]
		// (Apple a) -> a.getWeight() µÈ¼ÛÓÚ Apple::getWeight
		inventory.sort(comparing(SortFromWeight()));
		inventory.sort(comparing(Apple::getWeight));
		System.out.println(inventory);

		inventory.sort(comparing(Apple::getWeight).reversed());
		inventory.sort(comparing(Apple::getWeight).reversed().thenComparing(
				Apple::getColor));
	}

	private static Function<Apple, ? extends Integer> SortFromWeight() {
		return (Apple a) -> a.getWeight();
	}

	public static class Apple {
		private Integer weight = 0;
		private String color = "";

		public Apple(Integer weight, String color) {
			this.weight = weight;
			this.color = color;
		}

		public Integer getWeight() {
			return weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		@Override
		public String toString() {
			return "Apple{" + "color='" + color + '\'' + ", weight=" + weight
					+ '}';
		}
	}

	static class AppleComparator implements Comparator<Apple> {
		@Override
		public int compare(Apple a1, Apple a2) {
			return a1.getWeight().compareTo(a2.getWeight());
		}
	}
}
