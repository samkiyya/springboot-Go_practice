package com.samuelaberra.dev.demo.controller;

public class OrderService {
    
    public void placeOrder(){
var paymentService = new StripePaymentService();
paymentService.processPayment(10);
    }
}
