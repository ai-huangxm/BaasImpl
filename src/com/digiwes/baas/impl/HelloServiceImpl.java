package com.digiwes.baas.impl;

import com.digiwes.baas.interf.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello() {
		return "Hello, Baas! " + System.currentTimeMillis();
	}

}
