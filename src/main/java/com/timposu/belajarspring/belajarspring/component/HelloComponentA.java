package com.timposu.belajarspring.belajarspring.component;

import org.springframework.stereotype.Component;

@Component
public class HelloComponentA {
	
	private HelloComponentB componentB;
		
	public HelloComponentA(HelloComponentB componentB) {
		this.componentB = componentB;
	}

	public void sayMessage() {
		System.out.println(componentB.sayMessage("No Smoking"));
	}
}
