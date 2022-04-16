package com.bits.scalable.controller;

import com.bits.scalable.domain.Orders;
import com.bits.scalable.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
@Slf4j
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/save_order")
    public Orders saveOrder(@RequestBody Orders orders) {
        return orderService.saveOrder(orders);
    }

    @GetMapping("/get_customer_orders")
    public List<Orders> findByCustomerId(@RequestParam("customer_id") Long customerId) {
        return orderService.getByCustomerId(customerId);
    }

    @GetMapping("/get_order")
    public void getByOrderId(@RequestParam("id") Long orderId) {
        orderService.getByOrderId(orderId);
    }

}

