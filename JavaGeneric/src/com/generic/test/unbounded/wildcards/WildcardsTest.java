package com.generic.test.unbounded.wildcards;

import java.util.Arrays;
import java.util.List;

public class WildcardsTest {
	public static void printList(List<Object> list) {
		for (Object elem : list) {
			System.out.println(elem + "");
		}
		System.out.println();
	}

	public static void printWildcardsList(List<?> list) {
		for (Object elem : list) {
			System.out.println(elem + "");
		}
		System.out.println();
	}

	public static void main(String... args) {
		List<Integer> li = Arrays.asList(1, 2, 3);
		List<String> ls = Arrays.asList("one", "two", "three");

		// printList(li); it prints only a list of Object instances; it cannot
		// print List<Integer>, List<String>, List<Double>, and so on, because
		// they are not subtypes of List<Object>.
		printWildcardsList(li);
		printWildcardsList(ls);

	}
}
