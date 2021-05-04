package com.luv2code.springdemo;
import excercise.*;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("gymCoach", Coach.class);
		
		System.out.println(theCoach.getDailWorkout());
		
		context.close();
	}

}
