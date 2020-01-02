package com.wf.api;

import com.wf.model.Greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Greeting")
public interface GreetingService {
   @ApiOperation(value = "Just greets the world")
   @GetMapping(
      value = "/hello",
      produces = "application/json"
   )
   Greeting hello();

   @ApiOperation(value = "Greets a person given a name")
   @GetMapping(
      value = "/hello/{name}",
      produces = "application/json"
   )
   Greeting helloName(@PathVariable String name);
}