package com.ryu.cicd.githubcicdaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdActionApplication {
	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to RYU world !";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionApplication.class, args);
	}

}
