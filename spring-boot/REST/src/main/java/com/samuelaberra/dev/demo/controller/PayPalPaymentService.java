package com.samuelaberra.dev.demo.controller;

import org.springframework.stereotype.Service;

@Service
public class PayPalPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
          System.out.println("Processing payment of $" + amount + " through PayPal.");
        // Simulate PayPal API call
        System.out.println("Paypal payment successful!");
    }
    
}
