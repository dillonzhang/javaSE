package com.generic.test.bounded;

public class Box<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public <U extends Number> void inspect(U u) {
		System.out.println("T" + t.getClass().getName());
		System.out.println("U" + u.getClass().getName());
	}

	public static void main(String... args) {
		Box<Integer> integerBox = new Box<Integer>();
		integerBox.setT(new Integer(1));
		// integerBox.inspect("sometext"); // sometext is not subtype of Number
	}
}
