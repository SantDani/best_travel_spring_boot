package com.debuggeando_ideas.best_travel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class BestTravelApplication implements CommandLineRunner {
	@Autowired
	private MyService myService;




	public static void main(String[] args) {
		SpringApplication.run(BestTravelApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(myService.helloWorld());
	}
}

@Service
class MyService{
	public String helloWorld(){
		return "Hello World";
	}
}