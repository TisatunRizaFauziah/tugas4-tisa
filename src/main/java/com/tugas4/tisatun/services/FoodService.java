package com.tugas4.tisatun.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tugas4.tisatun.models.Food;

@Service
public class FoodService {
    public List<Food>getAllFoods()
    {
        List<Food> food = new ArrayList<>();
        food.add(new Food(1,"Chicken steak",23000L,"Sedang"));
        food.add(new Food(2,"Kentang goreng",19000L,"Besar"));
        food.add(new Food(3,"Ayam geprek",25000L,"Kecil"));
        food.add(new Food(4,"Nasi goreng",24000L,"Sedang"));
        return food;
    }
}
