package com.miniproj.contoroller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // Provide your custom error page Thymeleaf template name
        return "error";
    }

    public String getErrorPath() {
        return "/error";
    }
}