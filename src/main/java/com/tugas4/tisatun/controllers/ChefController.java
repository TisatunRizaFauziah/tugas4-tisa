package com.tugas4.tisatun.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tugas4.tisatun.models.Chef;
import com.tugas4.tisatun.services.ChefService;

@Controller
public class ChefController {
    @Autowired
    private ChefService chefservice;

    @GetMapping("/list-chef")
    public String chef(Model model) {
        List<Chef> chef = chefservice.getAllChef();
        model.addAttribute("chef", chef);
        return "chef"; // file html
    }
}
