package com.bits.scalable.repository;

import com.bits.scalable.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Orders, Long> {

    List<Orders> findByCustomerId(Long customerId);

}
