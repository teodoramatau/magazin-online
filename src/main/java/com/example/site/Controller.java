package com.example.site;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String index() {
		return "Bine ati venit!";
	}

	@RequestMapping(value="/products")
	public List <Product> getallProduct() {
		Product p1 = new Product ("Recas Sole", "Chardonnay", "sec", "alb", 59.4);
		Product p2 = new Product ("Aurelia Visinescu Anima 3", "Feteasca Neagra", "sec", "rosu", 96.09);
		Product p3 = new Product ("Rasova La Plage", "Pinot Noir", "sec", "rose", 33.3);
		
		return Arrays.asList (p1, p2, p3);
	}
   }