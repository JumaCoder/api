package com.basement.app.api.controllers;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {
	
	@GetMapping(value="/")
	public String getPage() {
		return "Something";
	}
}
