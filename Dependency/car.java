package com.example.dependency;

public class car 
{
    @Inject
   private Engine engine;
   
   
   public void drive()
   {
     engine.start();
    System.out.println("car is  driving");
   }
}
