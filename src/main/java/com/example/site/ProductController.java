package com.example.site;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Service
@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	@Autowired
	ProductRepository productRepo;
	
	@GetMapping("/products")
	public String products(Model model) {
		model.addAttribute("products", productRepo.findAll());
		return "products";
	}
	
	@GetMapping("/addProduct")
	public String addProduct(Model model) {
		model.addAttribute("product", new Product());
		return "addProduct";
	}
	@PostMapping("/createProduct")
	public String createProduct(@ModelAttribute Product product, Model model) {
		model.addAttribute("product", product);
		productRepo.save(product);
		return "redirect:products";
	}
	
	@GetMapping("/product/{id}")
	public Optional<Product> product(@PathVariable Long id) {
		return productRepo.findById(id);
	}
	
}