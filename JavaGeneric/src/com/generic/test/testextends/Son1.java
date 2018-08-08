package com.generic.test.testextends;

//下面是错误的情况 父类的类型参数不明确，这会让编译器迷糊 ，让它迷糊了，就是错了！
//class Son1 extends Father<T>{}
public class Son1<T> extends Father<T> {// 最正常的继承，子类的泛型参数和父类的参数是一致的
	public Son1(T data) {
		super(data);
	}

	@Override
	public String toString() {
		return "Son1 [ data = " + data + " ]";
	}
}
