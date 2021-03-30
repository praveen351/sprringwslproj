package com.wsl.devops.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDemoController {
	@GetMapping("/")
	public String helloWorld() {
		return "Hello World!!!!!!!!!!!!";
	}
}
