package com.example.monir.paymentService.services;

import com.example.monir.paymentService.model.PaymentRequest;
import com.example.monir.paymentService.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}