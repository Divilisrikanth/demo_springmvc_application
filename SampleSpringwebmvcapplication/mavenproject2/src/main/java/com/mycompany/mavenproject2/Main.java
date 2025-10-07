package com.mycompany.mavenproject2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Add this annotation
public class Main {

    @RequestMapping("/welcome")
    @ResponseBody
    public String showWelcomePage(@RequestParam(defaultValue = "Guest") String name) {
        return "Welcome, " + name + "!";
    }
   
}