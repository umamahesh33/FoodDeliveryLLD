package FoodDeliverySystem.controller;

import FoodDeliverySystem.data.FoodItem;
import FoodDeliverySystem.data.Restaurant;
import FoodDeliverySystem.searcher.Searcher;

public class GetFoodItemById {
    private final Searcher searcher;
    public GetFoodItemById(Searcher searcher) {
        this.searcher = searcher;
    }

    public FoodItem getFoodItemById(int foodItemId){
        return searcher.getFoodItemById(foodItemId);
    }
}
