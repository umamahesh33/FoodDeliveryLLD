package FoodDeliverySystem.controller;

import FoodDeliverySystem.data.CuisineType;
import FoodDeliverySystem.data.FoodItem;
import FoodDeliverySystem.data.MealType;
import FoodDeliverySystem.data.StarRating;
import FoodDeliverySystem.searcher.*;

import java.util.ArrayList;
import java.util.List;

public class FoodItemSearcher {
    public List<FoodItem> searchFoodItem(String foodItemName, MealType mealType, List<CuisineType> cuisineTypes, StarRating starRating){
        List<FoodItemFilter> foodItemFilters = new ArrayList<>();
        foodItemFilters.add(new MealTypeFilter(mealType));
        foodItemFilters.add(new CuisineTypeFilter(cuisineTypes));
        foodItemFilters.add(new StarRatingFilter(starRating));
        Searcher searcher = new Searcher();
        return searcher.searchFoodItem(foodItemName, foodItemFilters);
    }
}
