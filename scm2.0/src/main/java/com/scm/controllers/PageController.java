package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PageController {

   
   @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home page Handler");
        model.addAttribute("name" , "Substring Technologies");
        model.addAttribute("youtubeChannel", "LearnCodeWithDurgesh");
        model.addAttribute("githubRepo" , "https://github.com/Pratimakumari8");
        return "home";

    }


    //about
    @RequestMapping("/about")
    public String aboutPage(){
        System.out.println("About page loading");
        return "about";
    }

    //services
    @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("sevices page loading");
        return "services";
    }

}
