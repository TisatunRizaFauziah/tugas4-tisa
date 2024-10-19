package com.tugas4.tisatun.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tugas4.tisatun.models.Chef;
import com.tugas4.tisatun.models.ChefRestaurant;
import com.tugas4.tisatun.models.Food;

@Service
public class ChefRestaurantService {
    private FoodService foodService;
    private ChefService chefService;

    @Autowired
    public ChefRestaurantService(FoodService foodService, ChefService chefService) {
        this.foodService = foodService;
        this.chefService = chefService;
    }

    public List<ChefRestaurant> getAllChefRestaurant() {
        List<Food> foods = foodService.getAllFoods();
        List<Chef> chefs = chefService.getAllChef();
        List<ChefRestaurant> chefRestaurants = new ArrayList<>();

        for (int i = 0; i < foods.size() && i < chefs.size(); i++) {
            ChefRestaurant chefRestaurant = new ChefRestaurant(foods.get(i), chefs.get(i));
            chefRestaurants.add(chefRestaurant);
        }

        return chefRestaurants;
    }
}
