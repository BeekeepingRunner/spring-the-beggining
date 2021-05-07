package excercise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;

@Configuration
public class MyConfig {

	@Bean
	public FortuneService stupidFortuneService() {
		return new StupidFortuneService();
	}
	
	@Bean
	public Coach coachMajk() {
		return new CoachMajk();
	}
}
