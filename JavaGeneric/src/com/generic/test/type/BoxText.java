package com.generic.test.type;

public class BoxText {

	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>();
		integerBox.setT(new Integer(1));

		Box<Double> doubleBox = new Box<Double>();
		doubleBox.setT(new Double(1));
		Double value = doubleBox.getT();
		System.out.println(value);
	}

}
