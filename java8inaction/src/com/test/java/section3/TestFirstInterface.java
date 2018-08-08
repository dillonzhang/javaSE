package com.test.java.section3;

public class TestFirstInterface {

	public static void main(String... args) {
		FirstFuntionInterface<String> ffi = () -> {
			return "test";
		};

		System.out.println(ffi.get());
		System.out.println(FirstFuntionInterface.getName());
		System.out.println(ffi.getMessage());

		useFirstFunctionInterface("dillon", () -> {
			return "first Function Interface running";
		});
	}

	public static void useFirstFunctionInterface(String who,
			FirstFuntionInterface<String> ffi) {
		System.out.println(who);
		System.out.println("calls");
		System.out.println(ffi.get());
	}
}
