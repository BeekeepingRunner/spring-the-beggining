package excercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.loggers.MyLoggerConfig;
import com.luv2code.springdemo.Coach;

public class ExcerciseApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(MyConfig.class, MyLoggerConfig.class);
	
		Coach coach = context.getBean("coachMajk", Coach.class);
		
		System.out.println(coach.getDailWorkout());
		System.out.println(coach.getDailyFortune());
		
		context.close();
	}

}
