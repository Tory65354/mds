package com.app.controller;

import com.app.model.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    @GetMapping("/registration")
    public String getRegistrationForm(Model model) {
        model.addAttribute("newUser", new Users());
        return "registration";
    }

    @PostMapping("/registration")
    public String storeNewUser(@ModelAttribute Users user, Model model) {
        model.addAttribute("firstName", user.getFirstName());
        model.addAttribute("lastName", user.getLastName());
        return "successRegistration";
    }
}
