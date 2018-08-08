package com.generic.test.testextends;

public class Son2<E, T> extends Father<T> {
	private E otherData;

	public Son2(E otherData, T data) {
		super(data);
		this.otherData = otherData;
	}

	@Override
	public String toString() {
		return "Son2 [otherData=" + otherData + ", data=" + data + "]";
	}

}
