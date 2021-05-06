package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import excercise.GymCoach;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("gymCoach", Coach.class);
		
		System.out.println(theCoach.getDailWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// Excercise
		GymCoach myCoach = (GymCoach) theCoach;
		System.out.println(myCoach.getEmail());
		System.out.println(myCoach.getTeam());
		
		context.close();
	}

}
