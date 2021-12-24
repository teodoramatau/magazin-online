package com.example.site.controller;

import com.example.site.dto.OrderDto;
import com.example.site.model.Order;
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
public class ShopController {
    @Autowired
    ProductService productService;

    @Autowired
    OrderService orderService;

    @GetMapping("/shop")
    public String products(Model model) {
        model.addAttribute("products", productService.listTable());
        model.addAttribute("order", new Order());
        model.addAttribute("orderDto", new OrderDto());
        return "shop/products";
    }

    @PostMapping("/sendOrder")
    public String createOrder(@ModelAttribute OrderDto orderDto) {
        try {
            Order savedOrder = orderService.addInTable(orderDto);
            return "redirect:/shop/success/" + savedOrder.getId();
        } catch (Exception ex) {
            return "redirect:/shop/error";
        }
    }

    @GetMapping("/shop/error")
    public String errorPage() {
        return "shop/errorPage";
    }

    @GetMapping("/shop/success/{orderId}")
    public String successPage(@PathVariable Long orderId, Model model) {
        model.addAttribute("orderId", orderId);
        return "shop/successPage";
    }
}
