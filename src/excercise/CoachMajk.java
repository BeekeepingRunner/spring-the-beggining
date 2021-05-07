package excercise;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;


public class CoachMajk implements Coach {

	@Autowired
	@Qualifier("stupidFortuneService")
	private FortuneService fortuneService;
	
	/*
	public CoachMajk(FortuneService f) {
		this.fortuneService = f;
	}
	 */
	@Override
	public String getDailWorkout() {
		return "Wez siê do roboty, kurde";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
