package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import excercise.GymCoach;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(theCoach.getDailWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// Excercise
		// GymCoach myCoach = (GymCoach) theCoach;
		// System.out.println(myCoach.getEmail());
		// System.out.println(myCoach.getTeam());
		
		context.close();
	}

}
