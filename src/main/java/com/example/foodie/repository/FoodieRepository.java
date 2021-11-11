package com.example.foodie.repository;

import com.example.foodie.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FoodieRepository extends JpaRepository<Hotel, Long> {




}
