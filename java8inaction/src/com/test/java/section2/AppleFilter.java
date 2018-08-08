package com.test.java.section2;

public interface AppleFilter {
	boolean filter(Apple apple);

	default boolean addForAll() {
		return true;
	}
}
