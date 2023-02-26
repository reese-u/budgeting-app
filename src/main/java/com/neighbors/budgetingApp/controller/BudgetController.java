package com.neighbors.budgetingApp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BudgetController {

    @GetMapping("/")
    public String hello() {
        return "hello, world!";
    }


}
