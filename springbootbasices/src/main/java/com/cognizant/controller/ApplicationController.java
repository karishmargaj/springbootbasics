package com.cognizant.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {
	
	@GetMapping
	public String welcome()
	{
		return "Welcome to metro city pune";
	}
	
	@GetMapping("/servicess")
	public String services()
	{
		return "It is a It Hub and It will provides you jobs";
	}
	@GetMapping("/address")
	public String address()
	{
		return "Hinjewadi | Pune | MH | India";
	}
	
	@GetMapping("/getalldata")
	public List<Employee> getAllData()
	{
		return Stream.of(new Employee(121, "SWARA", 9), new Employee(122, "KAJAL", 24)).collect(Collectors.toList());
	}

}
