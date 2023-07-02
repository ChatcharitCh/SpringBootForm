
package com.project.SpringBootForm.controller;

import com.project.SpringBootForm.entity.User;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class UserController {
    
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        
        // Drop down
        List<String> testList = Arrays.asList("test1", "test2", "test3");
        model.addAttribute("testList", testList);
        
        return "register_form";
    }
}
