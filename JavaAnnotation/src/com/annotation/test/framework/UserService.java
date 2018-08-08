package com.annotation.test.framework;


public class UserService {
	@NeedTest
	public void getUserName() {
		System.out.println("get User Name");
	}

	@NeedTest
	public void getUserAddress() {
		Integer port = null;
		System.out.println("get User Address" + port.toString());
	}

}
