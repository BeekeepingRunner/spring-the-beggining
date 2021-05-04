package excercise;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.Coach;

@Component
public class GymCoach implements Coach {

	@Override
	public String getDailWorkout() {
		return "Do a 100 push-ups";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
