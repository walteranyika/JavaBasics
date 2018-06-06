package com.walter;

public class Lesson2 {
    public static void main(String[] args) {
         String original_username="abc@yahoo.com";
         String original_password="123456";

         String username ="abc@yahoo.com";
         String password ="12345";

         if(original_username == username && original_password==password )
         {
             System.out.println("Logged in successfully");
         }
         else
         {
             System.out.println("Wrong username or password");
         }

    }
}


