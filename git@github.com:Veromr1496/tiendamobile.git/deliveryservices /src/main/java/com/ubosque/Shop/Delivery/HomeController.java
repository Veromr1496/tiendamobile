package com.ubosque.Shop.Delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String nont() {
		return "It is works!";
	}
}
