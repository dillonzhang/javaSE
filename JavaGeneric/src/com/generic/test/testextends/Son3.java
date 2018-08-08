package com.generic.test.testextends;

public class Son3 extends Father {// 继承时不指定父类的泛型参数,会有警告信息：Father is a raw type.
	public Son3(Object data) {// 这个的data类型为Object, 泛型已经被差除了
		super(data);
	}

	@Override
	public String toString() {
		return "Son3 [data=" + data + "]";
	}
}
