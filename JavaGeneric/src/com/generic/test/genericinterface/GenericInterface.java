package com.generic.test.genericinterface;

public interface GenericInterface<T, E> {
	E doSomething(T t);

	T doReverseThing(E e);
}
