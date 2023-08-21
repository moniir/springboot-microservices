package com.monir.orderService.service;

import com.monir.orderService.model.OrderRequest;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

}
