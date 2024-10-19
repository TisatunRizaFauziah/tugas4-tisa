package com.tugas4.tisatun.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tugas4.tisatun.models.Chef;
@Service
public class ChefService {
 
    public List<Chef> getAllChef()
    {
        List<Chef> chef = new ArrayList<>();
        chef.add(new Chef(1, "Hilwa", "semarang"));
        chef.add(new Chef(2, "Riri", "Banjar"));
        chef.add(new Chef(3, "Tisa", "Banjar"));
        chef.add(new Chef(4, "Siti", "KBB"));
        return chef;
    }
}
