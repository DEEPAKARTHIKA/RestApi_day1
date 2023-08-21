package com.skcet.day1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control {
	private String yourFavColor="Green";
    @GetMapping("/display")
    public String getMyFav() {
    	return "My favorite color is "+yourFavColor;
    }
}
