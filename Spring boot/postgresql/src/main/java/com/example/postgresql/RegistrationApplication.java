package com.example.postgresql;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationApplication {

    @GetMapping("/welcome")
    public String Api(){

        return "Bienvenue dans l API";
    }
}
