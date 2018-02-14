package com.hellokoding.springboot;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	Log log = LogFactory.getLog(HelloController.class);
	
    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        
        org.springframework.security.core.Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		log.info("usuario: " + auth.getPrincipal());
		log.info("credentials: " + auth.getCredentials());
		log.info("authorities: " + auth.getAuthorities()) ;
		log.info("details : " + auth.getDetails());	
		
		
        return "hello1";
    }
}
