package excercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.FortuneService;

@Component
public class FileFortuneService implements FortuneService {

	ArrayList<String> fortunes = new ArrayList<>();
	Random myRandom = new Random();
	
	public FileFortuneService() throws IOException {
		
		BufferedReader buffReader = new BufferedReader(new FileReader("fortunes.txt"));
		
		String line = "";
		while ((line = buffReader.readLine()) != null) {
			fortunes.add(line);
		}
		
		buffReader.close();
	}
	
	@Override
	public String getFortune() {
		return fortunes.get(myRandom.nextInt(fortunes.size()));
	}

}
