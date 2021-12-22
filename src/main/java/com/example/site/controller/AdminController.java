package com.example.site.controller;

import com.example.site.model.Product;
import com.example.site.service.OrderService;
import com.example.site.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

	@Autowired
	ProductService productService;

	@Autowired
	OrderService orderService;
	
	@GetMapping("/products")
	public String products(Model model) {
		model.addAttribute("products", productService.listTable());
		model.addAttribute("orders", orderService.listTable());
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
		productService.addOrUpdate(product);
		return "redirect:/products";
	}

	@GetMapping("/updateProduct/{id}")
	public String updateProduct(@PathVariable Long id, Model model) {
		model.addAttribute("product", productService.getProduct(id));
		return "updateProduct";
	}

	@GetMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable Long id) {
		productService.deleteFromTable(id);
		return "redirect:/products";
	}
}