package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.loggers.MyLoggerConfig;

// import excercise.GymCoach;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class, MyLoggerConfig.class);
		
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		System.out.println(theCoach.getDailWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// Excercise
		// GymCoach myCoach = (GymCoach) theCoach;
		// System.out.println(myCoach.getEmail());
		// System.out.println(myCoach.getTeam());
		
		context.close();
	}

}
