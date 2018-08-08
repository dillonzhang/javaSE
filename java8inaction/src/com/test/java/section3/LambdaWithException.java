package com.test.java.section3;

import java.io.IOException;
import java.util.function.Function;

/*
 * ��ע�⣬�κκ���ʽ�ӿڶ��������׳��ܼ��쳣��checked exception�����������ҪLambda
 * ���ʽ���׳��쳣�������ְ취��
 * 1. ����һ���Լ��ĺ���ʽ�ӿڣ��������ܼ��쳣
 * ���磬��3.3�����ǽ�����һ���µĺ���ʽ�ӿ�BufferedReaderProcessor������ʽ������һ��IOException��
 * 2. ��Lambda����һ��try/catch���С�
 * �������������ʹ��һ�����ܺ���ʽ�ӿڵ�API������Function<T, R>��û�а취�Լ�����һ��, ��������£��������ʽ��׽�ܼ��쳣��
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