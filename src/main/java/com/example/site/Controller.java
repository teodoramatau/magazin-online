package com.example.site;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String index() {
		return "Bine ati venit!";
	}

	@PostMapping("/produs")
	 public ArrayList<Product> prodList(@RequestBody Product produs) {
		
       return prodList(null);
	}
   }