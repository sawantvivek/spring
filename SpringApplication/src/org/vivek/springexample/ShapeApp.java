package org.vivek.springexample;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SuppressWarnings("deprecation")
public class ShapeApp {

	private static AbstractApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("Triangle");
		triangle.drawShape();
		context.registerShutdownHook();
		triangle = (Triangle) context.getBean("Triangle");

	}

}
