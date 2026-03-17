
package dev.samuelaberra.rest_service.helloworld;

import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloWorld {
	private MessageSource messageSource;
	public HelloWorld(MessageSource messageSource) {
		this.messageSource=messageSource;
	}
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
	
	//path parameters
	@GetMapping("/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		
		return new HelloWorldBean(String.format("Hello %S", name));
	}
	
	@GetMapping("/hello-world-internationalized") 
	public String helloWorldInternationalized() {
		//1: good.mornning.message
		//2: 
		// message code, any variable to be replaced as template, default message, local/ language to be picked
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.mornning.message", null, "default message", locale);
	}

}

