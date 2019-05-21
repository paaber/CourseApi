/**
 * 
 */
package com.paaber.courseapi.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author botosoftdev
 *
 * 21 May 2019
 */
@RestController
@RequestMapping("/")
public class HelloControler {
	@GetMapping("/hello")
	private String sayHi() {
		return "hey THERE";
	}
	@RequestMapping("/hi")
	private String sayHiThere() {
		return "hey THERE";
	}
}
