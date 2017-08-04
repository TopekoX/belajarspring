package com.timposu.belajarspring.belajarspring.model;

public class HelloC {

	private HelloA helloA;
	
	private HelloB helloB;

	public HelloC(HelloA helloA, HelloB helloB) {
		this.helloA = helloA;
		this.helloB = helloB;
	}

	public HelloA getHelloA() {
		return helloA;
	}

	public void setHelloA(HelloA helloA) {
		this.helloA = helloA;
	}

	public HelloB getHelloB() {
		return helloB;
	}

	public void setHelloB(HelloB helloB) {
		this.helloB = helloB;
	}
		
}
