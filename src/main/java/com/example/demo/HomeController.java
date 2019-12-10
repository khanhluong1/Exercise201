package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(){
        return "homepage";
    }
    @RequestMapping("/processform")
    public String homePage(@RequestParam("email") String email, Model model){
        model.addAttribute("emailval",email);
        return "confirm";
    }
}
