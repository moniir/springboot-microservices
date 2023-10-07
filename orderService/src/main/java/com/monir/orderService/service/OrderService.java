package com.monir.orderService.service;

import com.monir.orderService.model.OrderRequest;
import com.monir.orderService.model.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);
    OrderResponse getOrderDetails(long orderId);

}
