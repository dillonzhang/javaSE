package com.generic.test.testextends;

public class Son4 extends Father<Integer> {

	public Son4(Integer data) {
		super(data);
	}

	@Override
	public String toString() {
		return "Son4 [data=" + data + "]";
	}
}
