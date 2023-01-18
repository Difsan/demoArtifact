package com.example.demoArtifact;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${app.varexample}")
    String message;

    @GetMapping("/get")
    public String Saludo(){
        System.out.println(message);
        return "Holirri";
    }
}
