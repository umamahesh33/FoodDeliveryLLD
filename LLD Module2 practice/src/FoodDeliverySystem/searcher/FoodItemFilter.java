package FoodDeliverySystem.searcher;

import FoodDeliverySystem.data.FoodItem;

public interface FoodItemFilter {
    boolean apply(FoodItem foodItem);
}
