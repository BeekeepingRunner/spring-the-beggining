package excercise;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;

@Component
@Scope("prototype")
public class GymCoach implements Coach, DisposableBean {

	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("GymCoach: doMyStartupStuff()");
	}
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailWorkout() {
		return "Do a 100 push-ups";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("GymCoach: destroy()!");
	}
}
