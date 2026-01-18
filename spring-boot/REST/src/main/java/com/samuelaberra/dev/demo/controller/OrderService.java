package com.samuelaberra.dev.demo.controller;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;

    // use autowired for cases when there is multiple constructor
    // @Autowired
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    public void placeOrder(){
        paymentService.processPayment(10);
    }
    // public void setPaymentService(PaymentService paymentService) {
    //     this.paymentService = paymentService;
    // }
}
