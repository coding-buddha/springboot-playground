package edu.pasudo123.study.demo;

import edu.pasudo123.study.demo.listener.MyStartedListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * https://docs.spring.io/spring-boot/docs/2.3.7.RELEASE/reference/html/
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(DemoApplication.class)
				.listeners(new MyStartedListener())		// add listener
				.addCommandLineProperties(true)			// enable command line properties (default : true)
				.run(args);
	}
}
