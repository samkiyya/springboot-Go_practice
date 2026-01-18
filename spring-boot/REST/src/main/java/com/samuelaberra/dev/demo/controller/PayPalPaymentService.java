package com.samuelaberra.dev.demo.controller;

public class PayPalPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
          System.out.println("Processing payment of $" + amount + " through PayPal.");
        // Simulate PayPal API call
        System.out.println("Paypal payment successful!");
    }
    
}
