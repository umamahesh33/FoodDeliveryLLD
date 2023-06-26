package FoodDeliverySystem.searcher;

import FoodDeliverySystem.data.CuisineType;
import FoodDeliverySystem.data.FoodItem;
import FoodDeliverySystem.data.Restaurant;

import java.util.List;

public class CuisineTypeFilter implements FoodItemFilter, RestaurantFilter {
    private final List<CuisineType> cuisineTypes;

    public CuisineTypeFilter(List<CuisineType> cuisineTypes) {
        this.cuisineTypes = cuisineTypes;
    }

    @Override
    public boolean apply(FoodItem foodItem) {
        return cuisineTypes.contains(foodItem.getCuisineType());
    }

    @Override
    public boolean apply(Restaurant restaurant) {
        List<CuisineType> offeredCuisines = restaurant.getOfferedCuisines();
        for(CuisineType cuisineType : cuisineTypes){
            if(offeredCuisines.contains(cuisineType)) return true;
        }
        return false;
    }
}
