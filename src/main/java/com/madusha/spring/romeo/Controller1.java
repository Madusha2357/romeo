/***
 * @author Madusha Rajapaksha (madusharajapaksha69@gmailcom)
 */
package com.madusha.spring.romeo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {
	
	@RequestMapping("/randika")
	public String randika() {
		System.out.println("Hello Madusha");
		return "Hello Madusha";
	}

	@RequestMapping("/")
	public String hello() {
		System.out.println("Hello World");
		return "Hello Worlds";
	}

}
