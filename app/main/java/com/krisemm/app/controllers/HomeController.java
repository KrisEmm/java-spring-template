package com.krisemm.app.controllers;

import com.krisemm.context.ContextService;
import com.krisemm.shared.SharedService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private ContextService context;
    private SharedService shared;

    public HomeController(ContextService context, SharedService shared) {
        this.context = context;
        this.shared = shared;
    }

    @GetMapping("/")
    public String Home(){
        return "Welcome to Java DDD Template";
    }

    @GetMapping("/context")
    public String ContextServiceMessage(){
        return context.getMessage();
    }

    @GetMapping("/shared")
    public String SharedServiceMessage(){
        return shared.getMessage();
    }

}
