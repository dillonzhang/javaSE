package com.generic.test.testextends;

//下面的写法也是错误的，要是父类的T为Object 这时E为什么呢？
//class Son6<E, E super T> extends Father<T> {
public class Son6<T, E extends T> extends Father<T> {
	E otherData;

	public Son6(T data, E otherData) {
		super(data);
		this.otherData = otherData;
	}

	@Override
	public String toString() {
		return "Son6 [otherData=" + otherData + ", data=" + data + "]";
	}
}
