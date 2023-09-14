package com.ssg.a.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockerTutoController {

    public static void main(String[] args) {
        SpringApplication.run(DockerTutoController.class, args);
    }
}

@RestController
@CrossOrigin(origins = "http://localhost:8080") // 프론트엔드 주소로 변경
class GitHubController {

    @GetMapping("/api/v1/{githubUsername}")
    public String getGitHubUsername(@PathVariable String githubUsername) {
    	System.out.println("getGitHubUsername: " + githubUsername);
    	
        return githubUsername;
    }

    @GetMapping("/healthcheck")
    public String healthCheck() {
    	System.out.println("healthCheck");
        return "Service is up and running!";
    }
}
