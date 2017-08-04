package com.timposu.belajarspring.belajarspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.timposu.belajarspring.belajarspring.component.HelloComponentA;

public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = 
         		new AnnotationConfigApplicationContext(SpringConfiguration.class);
    	
    	 HelloComponentA helloComponentA = context.getBean(HelloComponentA.class);
    	 helloComponentA.sayMessage();
     }
}
