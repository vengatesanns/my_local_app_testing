package com.helloworld.helloworld;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldHomeController {

	
	@GetMapping("/getUserList")
	public List<UserDetails> getUserDetails()
	{
		return Arrays.asList(new UserDetails("Vengat", "Theni", "Senior Software Engineer"),
				new UserDetails("Senthil", "Thirupur", "Senior Software Developer"),
				new UserDetails("Mano", "Erode", "Senior Java Developer"));
	}
}
