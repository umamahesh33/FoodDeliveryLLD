package FoodDeliverySystem.controller;

import FoodDeliverySystem.data.CuisineType;
import FoodDeliverySystem.data.MealType;
import FoodDeliverySystem.data.Restaurant;
import FoodDeliverySystem.data.StarRating;
import FoodDeliverySystem.searcher.*;

import java.util.ArrayList;
import java.util.List;

public class RestaurantSearcher {
    private final  Searcher searcher;

    public RestaurantSearcher(Searcher searcher) {
        this.searcher = searcher;
    }

    public List<Restaurant> searchRestaurant(String restaurantName, MealType mealType, List<CuisineType> cuisineTypes, StarRating starRating){
        List<RestaurantFilter> restaurantFilters = new ArrayList<>();
        if(mealType!=null)
            restaurantFilters.add(new MealTypeFilter(mealType));
        if(cuisineTypes != null)
            restaurantFilters.add((new CuisineTypeFilter(cuisineTypes)));
        if(starRating != null)
            restaurantFilters.add(new StarRatingFilter(starRating));
        return searcher.searchRestaurant(restaurantName, restaurantFilters);
    }
}
