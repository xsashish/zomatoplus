package com.thinkxfactor.zomatoplus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Item;
import com.thinkxfactor.zomatoplus.models.Restaurant;

@RestController
	@RequestMapping("/restaurant")
	public class RestaurantController {
		
		@PostMapping("/create")
		public Restaurant Details(@RequestBody Restaurant res) {
			Restaurant rs1 = new Restaurant();
			rs1.setResName(res.getResName());
			rs1.setResAdd(res.getResAdd());
			rs1.setResCon(res.getResCon());
			rs1.setResRat(res.getResRat());
			return rs1;
		}
		
		@GetMapping("/getAll")
		public List<Restaurant> Getall(@RequestParam("resname") String ResName, @RequestParam("resadd") String ResAdd, @RequestParam("contact") long ResCon, @RequestParam("rating") float ResRat) {
			List ResList = new ArrayList<Restaurant>();
			Restaurant rs2 = new Restaurant();
			rs2.setResName(ResName);
			rs2.setResAdd(ResAdd);
			rs2.setResCon(ResCon);
			rs2.setResRat(ResRat);
			ResList.add(rs2);
			return ResList;			
		}
		
		@PostMapping("/addItems")
		public Item AddItem(@RequestBody Item item) {
			Item it1 = new Item();
			it1.setMenuItem(item.getMenuItem());
			it1.setItemPrice(item.getItemPrice());
			return it1;
		}
	}

