package com.timposu.belajarspring.belajarspring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.timposu.belajarspring.belajarspring.model.HelloB;
import com.timposu.belajarspring.belajarspring.model.HelloC;
import com.timposu.belajarspring.belajarspring.model.HelloA;

@Configuration
@ComponentScan("com.timposu.belajarspring.belajarspring")
public class SpringConfiguration {
	
	@Bean(name = "ucup")
	public HelloA sayHello1(){
		HelloA helloA = new HelloA();
		helloA.setMessage("Ucup");
		return helloA;
	}
	
	@Bean(name = "timposu")
	public HelloA sayHello2(){
		HelloA helloA = new HelloA();
		helloA.setMessage("Timposu");
		return helloA;
	}

	@Bean
	public HelloB helloA(@Qualifier("timposu") HelloA helloA) {
		HelloB helloB = new HelloB(helloA);
		return helloB;
	}
	
	@Bean
	public HelloC helloC(@Qualifier("ucup") HelloA helloA, HelloB helloB) {
		HelloC helloC = new HelloC(helloA, helloB);
		return helloC;
	}
}
