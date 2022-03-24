package com.hotmail.neil.britton.dietlogger.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotmail.neil.britton.dietlogger.model.FoodItem;
import com.hotmail.neil.britton.dietlogger.db.FoodItemRepository;

@RestController
@RequestMapping("/dietlogger")
public class FoodItemController {

	private final FoodItemRepository repository;
	
	FoodItemController(FoodItemRepository repository) {
		this.repository = repository;
	}
	
	Logger logger = LoggerFactory.getLogger(FoodItemController.class);
	
	@GetMapping(value="/foodItems",produces = MediaType.APPLICATION_JSON_VALUE)
	List<FoodItem> all() {
		
		List<FoodItem> foodItemList = repository.findAll();
		return foodItemList;
	}
	
	@GetMapping(value="/foodItem/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<FoodItem> getFoodItem(@PathVariable("id") Long id) {
		Optional<FoodItem> foodItem = repository.findById(id);
		if(foodItem.isEmpty()) {
			return new ResponseEntity<FoodItem>(null, new  HttpHeaders(), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<FoodItem>(foodItem.get(), new  HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping(value="/foodItemsByName/{name}",produces = MediaType.APPLICATION_JSON_VALUE)
	List<FoodItem> getFoodItemsByName(@PathVariable("name") String name) {
		
		List<FoodItem> foodItems = repository.findByName(name);
		
		return foodItems;
	}
	@PostMapping(value="/foodItem",consumes = MediaType.APPLICATION_JSON_VALUE,
	        produces = MediaType.APPLICATION_JSON_VALUE) 
	public FoodItem doPost(@RequestBody FoodItem foodItem) {
		FoodItem persistedFoodItem = repository.save(foodItem);
		
		return persistedFoodItem;
		
	}
}
