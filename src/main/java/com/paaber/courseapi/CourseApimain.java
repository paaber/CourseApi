/**
 * 
 */
package com.paaber.courseapi;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



/**
 * @author botosoftdev
 *
 * 21 May 2019
 */
@SpringBootApplication
public class CourseApimain  extends SpringBootServletInitializer{

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SpringApplication.run(CourseApimain.class, args);
	}
	private static SpringApplicationBuilder configureApplication(SpringApplicationBuilder builder) {

		return builder.sources(CourseApimain.class);

	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

		return configureApplication(builder);
	}

}
