package FoodDeliverySystem.searcher;

import FoodDeliverySystem.data.FoodItem;
import FoodDeliverySystem.data.MealType;
import FoodDeliverySystem.data.Restaurant;

public class MealTypeFilter implements FoodItemFilter, RestaurantFilter {
    private final MealType mealType;

    public MealTypeFilter(MealType mealType) {
        this.mealType = mealType;
    }

    @Override
    public boolean apply(FoodItem foodItem) {
        return foodItem.getMealType().equals(this.mealType);
    }

    @Override
    public boolean apply(Restaurant restaurant) {
        return restaurant.getMealType().equals(this.mealType);
    }
}
