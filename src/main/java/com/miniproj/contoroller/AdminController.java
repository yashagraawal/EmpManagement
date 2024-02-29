package com.miniproj.contoroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    // Display login page
    @GetMapping("/login")
    public String loginPage() {
        return "admin/login";
    }

    // Display register page
    @GetMapping("/register")
    public String registerPage() {
        return "admin/register";
    }

    // Redirect to employee page after successful login
    @GetMapping("/admin/employee")
    public String adminEmployeePage() {
        return "redirect:/employee";
    }
}
