package excercise;

import com.luv2code.springdemo.FortuneService;

public class StupidFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Kto ci ukrad� marzenia, do diaska?";
	}

}
