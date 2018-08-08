package com.test.java.section2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterEverything<T> {
	public List<T> filter(List<T> list, Predicate<T> p) {
		List<T> result = new ArrayList<>();
		for (T e : list) {
			if (p.test(e)) {
				result.add(e);
			}
		}
		return result;
	}
}
