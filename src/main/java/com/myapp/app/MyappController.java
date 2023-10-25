package com.myapp.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class MyappController {
	@GetMapping(value="/suresh")
	public String getdetails() {
		return "This is my app";
	}
}
