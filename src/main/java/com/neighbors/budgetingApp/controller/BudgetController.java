package com.neighbors.budgetingApp.controller;


import com.neighbors.budgetingApp.domain.Dish;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BudgetController {

    @GetMapping("/")
    public Dish top() {
        Dish dish = new Dish();
        dish.setDishName("味噌汁");
        dish.setPrice("200");
        return dish;
    }

}
