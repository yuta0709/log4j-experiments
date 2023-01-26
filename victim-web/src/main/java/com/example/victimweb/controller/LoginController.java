package com.example.victimweb.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

@Controller
public class LoginController {
    Logger log = LoggerFactory.getLogger(LoginController.class);

    @GetMapping("/")
    public String get(Model model){
        return "login";
    }

    @PostMapping("/")
    public String post(Model model, HttpServletRequest req){
        String userId = req.getParameter("user-id");
        model.addAttribute("userId", userId);
        log.info(userId);
        return "welcome";
    }

}
