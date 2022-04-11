package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET) // value = URL, method = 요청방식
    public String home(Model model){
        String text = "Hello World";
        model.addAttribute("text", text);
        return "home";
    }
}
