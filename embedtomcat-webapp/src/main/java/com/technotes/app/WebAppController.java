package com.technotes.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/profile")
public class WebAppController 
{
	@Autowired
	private GreetService greet;
	
	@RequestMapping("/greet/{customerName}")
	@ResponseBody
    public String greetCustomer(@PathVariable String customerName)
    {
		return greet.getGreeting(customerName);
    }
	
	@RequestMapping(value="greet",params="customerName")
	@ResponseBody
    public String greetCustomerAsParam(@RequestParam String customerName)
    {
		return greet.getGreeting(customerName);
    }
}
