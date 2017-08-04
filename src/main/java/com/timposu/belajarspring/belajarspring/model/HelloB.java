package com.timposu.belajarspring.belajarspring.model;

public class HelloB {

	private HelloA helloA;

	public HelloB(HelloA helloA) {
		super();
		this.helloA = helloA;
	}

	public HelloA getHello() {
		return helloA;
	}

	public void setHello(HelloA helloA) {
		this.helloA = helloA;
	}
	
}
