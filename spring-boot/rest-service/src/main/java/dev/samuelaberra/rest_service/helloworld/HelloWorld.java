
package dev.samuelaberra.rest_service.helloworld;

import org.springframework.web.bind.annotation.RestController;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloWorld {
//	@RequestMapping(method = RequestMethod.GET, path="/hello-world")

	// a bit longer but readable form is @GetMapping(path="/hello-world")
	@GetMapping("/hello-world") 
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		
		return new HelloWorldBean("Hello World");
	}
	
	@GetMapping("/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		
		return new HelloWorldBean(String.format("Hello %S", name));
	}
}

