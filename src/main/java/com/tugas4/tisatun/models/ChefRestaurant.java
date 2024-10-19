package com.tugas4.tisatun.models;

public class ChefRestaurant {
    private Food food;
    private Chef chef;

    public ChefRestaurant(Food food, Chef chef) {
        this.food = food;
        this.chef = chef;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

}
