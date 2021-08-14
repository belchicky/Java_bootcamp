package jtm.activity15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// uncomment these annotations to notify to SpringBoot framework
// that this class can be run as SpringBoot application
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class JettyApplication {
	public static void main(String[] args) throws Exception {	
		// uncomment next line to start JettyApplication web app:
		SpringApplication.run(JettyApplication.class, args);
		// Look at
		// http://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/SpringApplication.html
		// for more information.
	}
}
