package russell.springBootTutorial.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping("/")
	public String getGreeting() { 
		return "HelloWorld how is Pud??";
	}
	
	
	@RequestMapping("/hi")
	public String getHi() { 
		return "Hi";
	}


}
