package excercise;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;

public class BeanProcessorApp {

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		Coach theCoach = context.getBean("gymCoach", Coach.class);
		
		System.out.println(theCoach.getDailWorkout());
		
		context.close();
	}

}
