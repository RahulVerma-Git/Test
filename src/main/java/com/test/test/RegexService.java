package com.test.test;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class RegexService {
	
	public Map<String,Object> checkRegex(DTO request) {
		Map response = new HashMap<String,Object>();
	    String regex = request.getRegex();
	    String textBody = request.getTextBody();
	    try{
	    Pattern p = Pattern.compile(regex);
	    Matcher m = p.matcher(textBody);
		    if(m.find()) {
		    response.put("match", m.group());
		    response.put("error", false);
		    }
	    else{
		    response.put("match", null);
		    response.put("error", false);
		    }
	    }
	    catch(PatternSyntaxException e){
	    	response.put("match", null);
		    response.put("error", true);
	    }
	    catch(Exception e) {
	    	response.put("message",e.getMessage());
	    }
	    return response;
	}

}
