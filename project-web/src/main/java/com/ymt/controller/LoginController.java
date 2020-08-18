package com.ymt.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class LoginController {
    @RequestMapping("login")
    public String login(Model model)
    {
        return "MyLogin";
    }
}
