package com.generic.test.testextends;

public class Son5<T> extends Father<String> {
	T otherData;

	public Son5(String data, T otherData) {
		super(data);
		this.otherData = otherData;
	}

	@Override
	public String toString() {
		return "Son5 [otherData=" + otherData + ", data=" + data + "]";
	}
}
