package com.wf.api.model;

public class Greeting {
   private String message;

   public Greeting() {
      this("");
   }

   public Greeting(String message) {
      this.message = message;
   }

   public String getMessage() {
      return message;
   }

   public void setMessage(String message) {
      this.message = message;
   }
}