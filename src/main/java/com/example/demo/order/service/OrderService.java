package com.example.demo.order.service;

import com.example.demo.order.dto.OrderDto;
import com.example.demo.order.model.Order;

public interface OrderService {

    Order addOrder(OrderDto orderDto);
}
