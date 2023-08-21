package com.skcet.day1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
       @GetMapping("/welcome")
       public String Welcome() {
    	   return "Welcome String Boot!";
       }
}
