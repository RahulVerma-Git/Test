package com.test.test;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/test")
class TestRegex{
	
	 @Autowired
	 RegexService rs;
	
	 @PostMapping("/regex")
	 public Map<String,Object> checkRegex(@RequestBody DTO request){
		 
		 Map<String,Object> response = rs.checkRegex(request);
		 return response;
		 
	}
}
