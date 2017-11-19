package com.sample.basicauth.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
public class LoginController {

    @Value("${welcome.message}")
    private String message = "Hello World";

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView welcome(Map<String, Object> model) {
        ModelAndView mav = new ModelAndView("welcome");
        mav.addObject("message", this.message);
        return mav;
    }
}
