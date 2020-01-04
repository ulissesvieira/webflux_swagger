package com.wf.greeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.wf")
public class SpringWebfluxApplication {

	public static void main(final String[] args) {
		SpringApplication.run(SpringWebfluxApplication.class, args);
	}

}
