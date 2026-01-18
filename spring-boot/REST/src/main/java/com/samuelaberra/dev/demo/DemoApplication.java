package com.samuelaberra.dev.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.samuelaberra.dev.demo.controller.OrderService;
import com.samuelaberra.dev.demo.controller.PayPalPaymentService;
// import com.samuelaberra.dev.demo.controller.StripePaymentService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);
		// var orderService = new OrderService(new StripePaymentService());
		var orderService = new OrderService(new PayPalPaymentService());
		orderService.placeOrder();
	}
}
