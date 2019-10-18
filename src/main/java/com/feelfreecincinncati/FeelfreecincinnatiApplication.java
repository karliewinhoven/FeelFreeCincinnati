package com.feelfreecincinncati;

import org.joda.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FeelfreecincinnatiApplication {

	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
		System.out.println("The time is now: " + currentTime); // use this to know the current time
		SpringApplication.run(FeelfreecincinnatiApplication.class, args);
	}

}
