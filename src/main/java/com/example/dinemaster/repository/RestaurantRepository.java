/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.dinemaster.repository;

import com.example.dinemaster.model.Restaurant;

import java.util.*;

public interface RestaurantRepository {
    ArrayList<Restaurant> getRestaurants();

    Restaurant addRestaurant(Restaurant restaurant);

    Restaurant getRestaurantById(int restaurantId);

    Restaurant updateRestaurant(int restaurantId, Restaurant restaurant);

    void deleteRestaurant(int restaurantId);
}