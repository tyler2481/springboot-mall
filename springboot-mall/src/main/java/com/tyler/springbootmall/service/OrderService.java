package com.tyler.springbootmall.service;

import com.tyler.springbootmall.dto.CreateOrderRequest;
import com.tyler.springbootmall.dto.OrderQueryParams;
import com.tyler.springbootmall.model.Order;

import java.util.List;

public interface OrderService {
    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
