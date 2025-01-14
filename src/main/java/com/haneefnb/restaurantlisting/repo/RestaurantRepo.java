package com.haneefnb.restaurantlisting.repo;

import com.haneefnb.restaurantlisting.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant, Integer> {
}
