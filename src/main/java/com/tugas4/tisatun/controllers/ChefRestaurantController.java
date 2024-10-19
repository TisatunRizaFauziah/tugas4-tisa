package com.tugas4.tisatun.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tugas4.tisatun.models.ChefRestaurant;
import com.tugas4.tisatun.services.ChefRestaurantService;

@Controller
public class ChefRestaurantController {
    private ChefRestaurantService chefRestaurantService;

    @Autowired
    public ChefRestaurantController(ChefRestaurantService chefRestaurantService) {
        this.chefRestaurantService = chefRestaurantService;
    }

    @GetMapping("/chef-restaurant")
    public String getChefRestaurant(Model model) {
        List<ChefRestaurant> chefRestaurantList = chefRestaurantService.getAllChefRestaurant();
        model.addAttribute("chefRestaurantList", chefRestaurantList);
        return "chef-restaurant"; // file html
    }
}
