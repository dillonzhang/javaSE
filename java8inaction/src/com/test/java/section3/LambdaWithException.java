package com.test.java.section3;

import java.io.IOException;
import java.util.function.Function;

/*
 * 请注意，任何函数式接口都不允许抛出受检异常（checked exception）。如果你需要Lambda
 * 表达式来抛出异常，有两种办法：
 * 1. 定义一个自己的函数式接口，并声明受检异常
 * 比如，在3.3节我们介绍了一个新的函数式接口BufferedReaderProcessor，它显式声明了一个IOException：
 * 2. 把Lambda包在一个try/catch块中。
 * 但是你可能是在使用一个接受函数式接口的API，比如Function<T, R>，没有办法自己创建一个, 这种情况下，你可以显式捕捉受检异常：
 */
@FunctionalInterface
interface FunctionInterfaceWithException {
	String get() throws IOException;
}

public class LambdaWithException {
	public static void main() {
		Function<String, String> f = (String s) -> {
			try {
				return s.substring(10);
			} catch (Exception e) {
				throw new RuntimeException();
			}
		};

		System.out.println(f.apply("xxx"));
	}
}