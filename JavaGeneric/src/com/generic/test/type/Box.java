package com.generic.test.type;

//generic class
public class Box<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	// cannot make a static reference to the non-static type T
	// public static void test(T t) {
	//
	// }

	public static <E> void test(E e) {
		e.getClass();
	}
}
