package com.generic.test.testextends;

public class Test {

	public static void main(String[] args) {
		System.out.println(new Son1<String>("Alex"));
		System.out
				.println(new Son2<Integer, String>(Integer.valueOf(2), "Bob"));
		System.out.println(new Son3("Eric"));
		// System.out.println(new Son4<Integer>(Integer.valueOf(4)));
		System.out.println(new Son4(Integer.valueOf(4)));
		System.out.println(new Son5<Integer>("Edd", Integer.valueOf(5)));
		System.out.println(new Son6<Number, Long>(6, 6L));
	}
}
