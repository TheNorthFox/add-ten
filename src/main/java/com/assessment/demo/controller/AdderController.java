package com.assessment.demo.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.demo.model.AdderEntity;

@RestController
@RequestMapping("/api")
public class AdderController {
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET,
    produces = MediaType.APPLICATION_JSON_VALUE)
	public AdderEntity getSums(@PathVariable("id") int id) {
		AdderEntity adder = new AdderEntity();
		
		
		int sum = id + 10;
		adder.setSum(Integer.toString(sum));
		
		return adder;
	}
	
	
	

}
