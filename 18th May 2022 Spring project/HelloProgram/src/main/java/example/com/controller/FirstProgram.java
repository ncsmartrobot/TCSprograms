package example.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstProgram {
	
	@GetMapping(value = "/hello") 
	String Message() {
		return "This is My first project";

	}
	

}
