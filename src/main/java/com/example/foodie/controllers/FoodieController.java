package com.example.foodie.controllers;


import com.example.foodie.exception.ResourceNotFoundException;
import com.example.foodie.models.Hotel;
import com.example.foodie.repository.FoodieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class FoodieController {

    @Autowired
    FoodieRepository foodieRepository;

    // Get All Hotels
    @GetMapping("/fd_hotel")
    public List<Hotel> getAllHotels() {
        return foodieRepository.findAll();
    }

    // Create a new Hotel
    @PostMapping("/fd_hotel")
    public Hotel createNote(@Valid @RequestBody Hotel hotel) {
        return foodieRepository.save(hotel);
    }

    // Get a Single Hotel

    @GetMapping("/fd_hotel/{id}")
    public Hotel getHotelById(@PathVariable(value = "id") Long hotelId) {
        return foodieRepository.findById(hotelId)
                .orElseThrow(() -> new ResourceNotFoundException("Hotel", "id", hotelId));
    }

    // Update a Hotel

    // Delete a Hotel
}
