package simpleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"example.com.controller"})
public class HelloProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloProgramApplication.class, args);
	}

}
