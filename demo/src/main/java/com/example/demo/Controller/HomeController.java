package com.example.demo.Controller;

import com.example.demo.Model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        Person bob = new Person("Steffen", "Andersen");
        model.addAttribute("person", bob);
        return "index";
    }
}
