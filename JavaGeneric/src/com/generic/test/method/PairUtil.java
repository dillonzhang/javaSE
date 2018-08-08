package com.generic.test.method;


//generic method
public class PairUtil {
	public <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		return p1.getKey().equals(p2.getKey())
				& p1.getValue().equals(p2.getValue());
	}

	public static void main(String... arg) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "apple");
		Pair<Integer, String> p2 = new Pair<Integer, String>(2, "pear");
		PairUtil pu = new PairUtil();
		boolean result = pu.compare(p1, p2);
		System.out.println(result);
	}
}
