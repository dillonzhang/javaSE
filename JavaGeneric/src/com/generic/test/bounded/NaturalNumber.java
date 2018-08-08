package com.generic.test.bounded;

public class NaturalNumber<T extends Number> {
	private T t;

	public NaturalNumber(T t) {
		this.t = t;
	}

	public boolean isEven() {
		return t.intValue() % 2 == 0;
	}

}
