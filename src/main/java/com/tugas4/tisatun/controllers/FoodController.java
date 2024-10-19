package com.tugas4.tisatun.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.tugas4.tisatun.models.Food;
import com.tugas4.tisatun.services.FoodService;

@Controller
public class FoodController {
    @Autowired
    private FoodService foodservice;

    @GetMapping("/list-food")
    public String food(Model model) {
        List<Food> food = foodservice.getAllFoods();
        model.addAttribute("food", food);
        return "food"; //file html
    }
}
