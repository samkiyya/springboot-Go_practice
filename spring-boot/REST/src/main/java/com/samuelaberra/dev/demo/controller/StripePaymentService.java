package com.samuelaberra.dev.demo.controller;

public class StripePaymentService {
  
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe.");
        // Simulate Stripe API call
        System.out.println("Stripe payment successful!");
    }

}
