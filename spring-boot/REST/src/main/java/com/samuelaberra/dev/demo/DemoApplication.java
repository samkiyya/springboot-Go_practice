package com.samuelaberra.dev.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.samuelaberra.dev.demo.controller.OrderService;
// import com.samuelaberra.dev.demo.controller.PayPalPaymentService;
// import com.samuelaberra.dev.demo.controller.StripePaymentService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

	//   SpringApplication.run(DemoApplication.class, args);
	// injecting stripe payment with constructor injection	
	  // var orderService = new OrderService(new StripePaymentService());
	// orderService.placeOrder();

		// injecting paypal payment with constructor injection
		// var orderService = new OrderService(new PayPalPaymentService());
		// orderService.placeOrder();


		// use setter injection good for optional features
		// var orderService = new OrderService();
		// orderService.setPaymentService(new PayPalPaymentService());
		// orderService.placeOrder();

		// injecting payment service dynamically using the spring core (IOC which generates java Bean)
		ApplicationContext context =	SpringApplication.run(DemoApplication.class, args);
		var orderService = context.getBean(OrderService.class);
		orderService.placeOrder();
	}
}
