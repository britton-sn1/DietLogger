package com.hotmail.neil.britton.dietlogger.rest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hotmail.neil.britton.dietlogger.db.FoodItemRepository;
import com.hotmail.neil.britton.dietlogger.model.FoodItem;

//@Configuration
public class LoadDatabase {

	@Bean
	CommandLineRunner initDatabase(FoodItemRepository repository) {
		return args -> repository.save(new FoodItem("Rice", "100g", 
				Double.valueOf(29), // energy
				Double.valueOf(278), // protein
				Double.valueOf(728), // carbs
				Double.valueOf(728), // sugars
				Double.valueOf(6772), // fats
				Double.valueOf(72), // saturates
				Double.valueOf(0.378), // sodium
				Double.valueOf(23) // fibre
		));
	}
}
