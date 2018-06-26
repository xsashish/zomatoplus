package com.thinkxfactor.zomatoplus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Item;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repository.ItemRepository;
import com.thinkxfactor.zomatoplus.repository.RestaurantRepository;

@RestController
	@RequestMapping("/restaurant")
	public class RestaurantController {
		
//		public Restaurant ResObj;
	@Autowired
		public RestaurantRepository restaurantRepository;
	
	@Autowired
	public ItemRepository itemRepository;
	
	
		@PostMapping("/create")
		public Restaurant Details(@RequestBody Restaurant res) {
			Restaurant rs1 = restaurantRepository.save(res);
			return rs1;
		}
//		
		@GetMapping("/getAll")
		public List<Restaurant> getall() {
			List<Restaurant> listofrestaurants = restaurantRepository.findAll();
			return listofrestaurants;			
		}
			
		@PostMapping("/addItems")
		public Item AddItem(@RequestBody Item item) {
			Item it1 = itemRepository.save(item);
			return it1;
	}
	



}

