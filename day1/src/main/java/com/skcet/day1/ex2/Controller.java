package com.skcet.day1.ex2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
     @GetMapping("/get")
     public String getName() {
    	 String studentName="IamNeo";
    	 return "Welcome "+studentName+"!";
     }
}
