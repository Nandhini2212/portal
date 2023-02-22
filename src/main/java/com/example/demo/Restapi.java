package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restapi {
@Value("${value.name}")
private String test;
@GetMapping("/rest")
public String getName() {
	return "Welcome to this "+test;
}
}