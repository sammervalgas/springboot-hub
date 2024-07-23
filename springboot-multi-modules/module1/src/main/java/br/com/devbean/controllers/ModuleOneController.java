package br.com.devbean.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module1")
public class ModuleOneController {

    @GetMapping
    public String check() {
        return "I am Module 1";
    }

}
