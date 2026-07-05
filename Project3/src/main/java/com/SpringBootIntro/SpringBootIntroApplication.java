package com.SpringBootIntro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootIntroApplication {

	public static void main(String[] args) {

        System.out.println("Project Start ...");

        SpringApplication.run(SpringBootIntroApplication.class, args);

        System.out.println("Project end ...");
	}

}
