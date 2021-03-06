package com.wf.app.config;

import static java.util.Collections.emptyList;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;

@EnableSwagger2WebFlux
@Configuration
public class SwaggerConfig {
   @Value("${api.common.version}")           String apiVersion;
	@Value("${api.common.title}")             String apiTitle;
	@Value("${api.common.description}")       String apiDescription;
	@Value("${api.common.termsOfServiceUrl}") String apiTermsOfServiceUrl;
	@Value("${api.common.license}")           String apiLicense;
	@Value("${api.common.licenseUrl}")        String apiLicenseUrl;
	@Value("${api.common.contact.name}")      String apiContactName;
	@Value("${api.common.contact.url}")       String apiContactUrl;
   @Value("${api.common.contact.email}")     String apiContactEmail;
   
   /**
	 * Will exposed on $HOST:$PORT/swagger-ui.html
	 *
	 * @return
	 */
   @Bean
   public Docket apiDocumentation() {
      return new Docket(DocumentationType.SWAGGER_2)
         .select()
         .apis(RequestHandlerSelectors.any())
         .paths(PathSelectors.any())
         .build()
            .globalResponseMessage(POST, emptyList())
				.globalResponseMessage(GET, emptyList())
				.globalResponseMessage(DELETE, emptyList())
            .apiInfo(metaData());

   }

   private ApiInfo metaData() {
      return new ApiInfo(
         apiTitle,
         apiDescription,
         apiVersion,
         apiTermsOfServiceUrl,
         new Contact(apiContactName, apiContactUrl, apiContactEmail),
         apiLicense,
         apiLicenseUrl,
         emptyList()
      );
   }
}