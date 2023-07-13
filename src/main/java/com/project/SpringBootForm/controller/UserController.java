package com.project.SpringBootForm.controller;

import com.project.SpringBootForm.entity.User;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/register")
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);

        // Drop down
        List<String> course = Arrays.asList("Java Beginner to Master", "Basic Java Programming", 
                                            "Java Spring Boot Advance", "Full Stack Java Developer",
                                                "Spring Framework Zero to Hero");
        model.addAttribute("course", course);

        return "register_form";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute("user") User user) {
        System.out.println(user);
        return "register_success";
    }
   
}
