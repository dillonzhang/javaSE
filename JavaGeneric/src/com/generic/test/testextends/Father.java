package com.generic.test.testextends;

public class Father<T> {
	T data;

	public Father(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Father [ data = " + data + "]";
	}
}
