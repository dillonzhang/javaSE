package com.test.java.section3;

//һ���Ա�֮������ʽ�ӿھ���ֻ����һ�����󷽷��Ľӿ�f
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
