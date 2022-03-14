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
		return args -> repository.save(new FoodItem("Rice")); 
	}
}
