package com.tyler.springbootmall.service;

import com.tyler.springbootmall.dto.CreateOrderRequest;
import com.tyler.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
