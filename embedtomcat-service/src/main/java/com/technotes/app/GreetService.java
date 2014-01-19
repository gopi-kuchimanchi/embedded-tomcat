package com.technotes.app;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class GreetService 
{
    public String getGreeting(String name)
    {
    	String sayHello = "Hello ";
    	if(StringUtils.isBlank(name)){
    		sayHello = sayHello+"World!!";
    	}
    	else{
    		sayHello = sayHello+name;
    	}
    	return sayHello;
    }
}
