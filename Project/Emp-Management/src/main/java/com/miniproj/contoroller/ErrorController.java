package com.miniproj.contoroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorController {

    @GetMapping
    public String handleError(Model model) {
        model.addAttribute("errorMsg", "Oops! Something went wrong.");
        return "error";
    }
}
