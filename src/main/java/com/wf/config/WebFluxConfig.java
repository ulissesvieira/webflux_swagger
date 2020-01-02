/*package com.wf.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.ResourceHandlerRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@EnableWebFlux
@Configuration
public class WebFluxConfig implements WebFluxConfigurer {

   @Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//swagger resource
		//registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
		registry.addResourceHandler("/swagger/**").addResourceLocations("classpath:/static/swagger/");
   }

}*/