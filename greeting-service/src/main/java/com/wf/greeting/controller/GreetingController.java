package com.wf.greeting.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wf.api.service.GreetingService;
import com.wf.api.model.Greeting;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController implements GreetingService {
   private static final Logger LOG = LoggerFactory.getLogger(GreetingController.class);

   @Override
   public Greeting hello() {
      return new Greeting("Hello");
   }

   @Override
   public Greeting helloName(String name) {
      return new Greeting("Hello " + name);
   }

}