/**
 * 
 */
package com.example.springbootcamp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kkk88
 *
 */

@RestController
public class HelloWorldController {

	@GetMapping("/")
	public String getHelloMessage( ) {
		return "Hello World from Spring Boot Camp.";
	}
	
	@GetMapping("/test1")
	public String getHelloTest1Message( ) {
		return "Hello World from Spring Boot Camp. (test1)";
	}

}
