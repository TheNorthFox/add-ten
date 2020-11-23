package com.assessment.demo.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.demo.model.AdderEntity;

@RestController
@RequestMapping("/api")
public class AdderController {
	
	
	@RequestMapping(value = "/{sum}", method = RequestMethod.GET,
    produces = MediaType.APPLICATION_JSON_VALUE)
	public AdderEntity getSums(@PathVariable("sum") int id) {
		AdderEntity adder = new AdderEntity();
		
		adder.setSum(Integer.toString(id + 10));
		
		return adder;
	}
	
	// "printing \"this\" in quotes"
	
	@GetMapping
	public String addTen() {
		
		String result = " Add-Ten Example\n"
				+ " \n Use the link below \n "
				+ " \n https://pre-assessment-backend.herokuapp.com/api \n"
				+ " \n add a number at the end of the link\n "
				+ "\n Example: https://pre-assessment-backend.herokuapp.com/api/13 \n"
				+ "\n { "
				+ "\n \" sum \"  : \" 23 \" "
				+ " \n }";
		
		return result;
	}
	
	
	

}
