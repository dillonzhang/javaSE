package com.test.java.section3;

//一言以蔽之，函数式接口就是只定义一个抽象方法的接口f
@FunctionalInterface
public interface FirstFuntionInterface<T> {
	T get();

	static String getName() {
		return "function name";
	}

	default String getMessage() {
		return "function message";
	}
}
