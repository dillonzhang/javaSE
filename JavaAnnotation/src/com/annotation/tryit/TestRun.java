package com.annotation.tryit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestRun {
	public static void main(String... arg) {
		boolean testHasAn = Test.class
				.isAnnotationPresent(TestAnnotation.class);

		if (testHasAn) {
			TestAnnotation testAn = Test.class
					.getAnnotation(TestAnnotation.class);
			printAnnotation(testAn);
		}

		Test1 test1 = new Test1();
		boolean test1HasAn = test1.getClass().isAnnotationPresent(
				TestAnnotation.class);
		if (test1HasAn) {
			TestAnnotation test1An = test1.getClass().getAnnotation(
					TestAnnotation.class);
			printAnnotation(test1An);
		}

		try {
			Field a = Test.class.getDeclaredField("a");
			a.setAccessible(true);// 关闭java安全性能检测，大幅度提高运行速度
			// 获取一个成员变量上的注解
			Check check = a.getAnnotation(Check.class);

			if (check != null) {
				System.out.println("check value:" + check.value());
			}

			Method testMethod = Test.class.getDeclaredMethod("testMethod");

			if (testMethod != null) {
				// 获取方法中的注解
				Annotation[] ans = testMethod.getAnnotations();
				for (int i = 0; i < ans.length; i++) {
					System.out.println("method testMethod annotation:"
							+ ans[i].annotationType().getSimpleName());
				}
			}
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	private static void printAnnotation(TestAnnotation testAn) {
		System.out.println(testAn.id());
		System.out.println(testAn.message());
	}
}

@TestAnnotation
class Test {
	@Check("hahaha")
	private int a;

	@Perform
	public void testMethod() {
	}

}

@TestAnnotation(id = 1, message = "hello")
class Test1 {

}
