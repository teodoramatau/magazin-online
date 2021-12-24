package com.example.site.service;

import com.example.site.dto.OrderDto;
import com.example.site.model.Order;
import com.example.site.model.OrderedProducts;
import com.example.site.model.Product;
import com.example.site.repository.OrderRepository;
import com.example.site.repository.OrderedProductsRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final ProductService productService;
    private final OrderedProductsRepository orderedProductsRepository;

    public OrderService(OrderRepository orderRepository, ProductService productService, OrderedProductsRepository orderedProductsRepository) {
        this.orderRepository = orderRepository;
        this.productService = productService;
        this.orderedProductsRepository = orderedProductsRepository;
    }

    public List<Order> listTable() {
        return orderRepository.findAll();
    }

    public Order addInTable(Order order) {
        return orderRepository.save(order);
    }

    public Order addInTable(OrderDto orderDto) throws Exception {
        Order order = new Order();
        order.setClientName(orderDto.getClientName());
        order.setClientAddress(orderDto.getClientAddress());
        order.setClientEmail(orderDto.getClientEmail());
        order.setClientPhone(orderDto.getClientPhone());

        order = orderRepository.save(order);
        List<OrderedProducts> orderedProducts = new ArrayList<>();
        Long productId = 1L;
        for (String quantity: orderDto.getProducts()) {
            if (quantity == null) {
                continue;
            }

            if (Integer.parseInt(quantity) == 0) {
                productId++;
                continue;
            }

            Product product = productService.getProduct(productId);

            if (product != null && Integer.parseInt(quantity) != 0) {
                OrderedProducts or = new OrderedProducts();
                or.setOrder(order);
                or.setProduct(product);
                or.setQuantity(Integer.parseInt(quantity));
                orderedProducts.add(orderedProductsRepository.save(or));
            }

            if (product.getStoc() < Integer.parseInt(quantity)) {
                throw new Exception("Cantitatea comandata mai mare decat stocul existent pentru produsul " + product.getName());
            } else {
                product.setStoc(product.getStoc() - Integer.parseInt(quantity));
                productService.addOrUpdate(product);
            }

            productId++;
        }

        order.setOrderedProducts(orderedProducts);

        return orderRepository.save(order);
    }
}
