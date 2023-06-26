package FoodDeliverySystem.controller;

import FoodDeliverySystem.data.Restaurant;
import FoodDeliverySystem.searcher.Searcher;

public class GetRestaurantById {
    private final Searcher searcher;

    public GetRestaurantById(Searcher searcher) {
        this.searcher = searcher;
    }

    public Restaurant getRestaurantById(int restaurantId){
        return searcher.getRestaurantById(restaurantId);
    }
}
