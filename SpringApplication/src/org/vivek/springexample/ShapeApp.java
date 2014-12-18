package org.vivek.springexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SuppressWarnings("deprecation")
public class ShapeApp {

	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		//@SuppressWarnings("deprecation")
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("Triangle-Alias");
		triangle.drawShape();
		
		
	}

}
