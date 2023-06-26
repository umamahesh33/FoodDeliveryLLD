package FoodDeliverySystem.searcher;

import FoodDeliverySystem.data.Restaurant;

public interface RestaurantFilter {
    boolean apply(Restaurant restaurant);
}
