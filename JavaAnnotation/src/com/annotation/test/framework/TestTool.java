package com.annotation.test.framework;

import java.lang.reflect.Method;

public class TestTool {
	public static void main(String... arg) {
		UserService us = new UserService();
		Class classInfo = us.getClass();
		Method[] method = classInfo.getDeclaredMethods();
		int errornum = 0;
		StringBuffer log = new StringBuffer();

		for (Method m : method) {
			if (m.isAnnotationPresent(NeedTest.class)) {
				try {
					m.setAccessible(true);
					m.invoke(us, null);
				} catch (Exception e) {
					errornum++;
					log.append(m.getName());
					log.append(" has error: ");
					log.append(e.getCause());
				}
			}
		}

		log.append("\n\r" + classInfo.getSimpleName());
		log.append(String.format("has %s errors!", errornum));
		System.out.println(log);
	}
}
