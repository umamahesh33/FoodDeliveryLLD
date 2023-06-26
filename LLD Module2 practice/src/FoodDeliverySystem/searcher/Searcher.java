package FoodDeliverySystem.searcher;

import FoodDeliverySystem.data.FoodItem;
import FoodDeliverySystem.data.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Searcher {
    public List<FoodItem> searchFoodItem(String foodItemName, List<FoodItemFilter> foodItemFilters) {
        if(foodItemName == null || foodItemName.length() == 0 || foodItemFilters == null)
            throw new IllegalArgumentException("params passed are not valid");
        DataAccessResult dataAccessResult = DataAccessor.getFoodItemsWithName(foodItemName);
        List<FoodItem> foodItems = DataAccessorObjectConvertor.convertToFoodItems(dataAccessResult);
        List<FoodItem> filteredFoodItems = new ArrayList<>();
        for (FoodItem foodItem : foodItems) {
            boolean allFiltersPassed = true;
            for (FoodItemFilter foodItemFilter : foodItemFilters) {
                allFiltersPassed = foodItemFilter.apply(foodItem);
                if (!allFiltersPassed) break;
            }
            if (allFiltersPassed) filteredFoodItems.add(foodItem);
        }
        return filteredFoodItems;
    }


    public List<Restaurant> searchRestaurant(String restaurantName, List<RestaurantFilter> restaurantFilters) {
        if(restaurantName== null || restaurantName.length() == 0 || restaurantFilters == null)
            throw new IllegalArgumentException("params passed are not valid");
        DataAccessResult dataAccessResult = DataAccessor.getRestaurantWithName(restaurantName);
        List<Restaurant> restaurants = DataAccessorObjectConvertor.convertToRestaurants(dataAccessResult);
        for(RestaurantFilter restaurantFilter : restaurantFilters){
            List<Restaurant> filteredRestaurants = new ArrayList<>();
            for(Restaurant restaurant : restaurants){
                if(restaurantFilter.apply(restaurant)) filteredRestaurants.add(restaurant);
            }
            restaurants = filteredRestaurants;
        }
        return restaurants;
    }

    public Restaurant getRestaurantById(int restaurantId){
        if(restaurantId <= 0)
            throw new IllegalArgumentException("not a valid id");
        DataAccessResult dataAccessResult = DataAccessor.getRestaurantById(restaurantId);
        return DataAccessorObjectConvertor.converToRestaurant(dataAccessResult);
    }

    public FoodItem getFoodItemById(int foodItemId){
        if(foodItemId <= 0)
            throw new IllegalArgumentException("not a valid id");
        DataAccessResult dataAccessResult = DataAccessor.getFoodItemById(foodItemId);
        return DataAccessorObjectConvertor.converToFoodItem(dataAccessResult);
    }
}
