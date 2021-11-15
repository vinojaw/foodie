package com.example.foodie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class FoodieApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(FoodieApplication.class, args);
	}

}
