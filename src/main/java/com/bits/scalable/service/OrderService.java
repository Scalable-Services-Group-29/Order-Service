package com.bits.scalable.service;

import com.bits.scalable.domain.Orders;
import com.bits.scalable.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OrderService {

    final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Orders saveOrder(Orders orders) {
        return orderRepository.save(orders);
    }

    public List<Orders> getByCustomerId(Long customerId) {
        return orderRepository.findByCustomerId(customerId);
    }

    public Orders getByOrderId(Long orderId) {
        return orderRepository.getById(orderId);
    }
}
