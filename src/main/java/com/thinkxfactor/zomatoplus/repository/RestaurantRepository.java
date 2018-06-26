package com.thinkxfactor.zomatoplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.User;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
	Restaurant findByNameAndId(String name, long id);
}
