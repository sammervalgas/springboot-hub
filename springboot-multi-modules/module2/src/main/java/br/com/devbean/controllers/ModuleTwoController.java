package br.com.devbean.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module2")
public class ModuleTwoController {

    @GetMapping
    public String check() {
        return "HERE IS THE MODULE 2";
    }


}
