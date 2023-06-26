package FoodDeliverySystem.searcher;

import FoodDeliverySystem.data.FoodItem;
import FoodDeliverySystem.data.Restaurant;
import FoodDeliverySystem.data.StarRating;

public class StarRatingFilter implements FoodItemFilter, RestaurantFilter {
    private final StarRating starRating;

    public StarRatingFilter(StarRating starRating) {
        this.starRating = starRating;
    }

    @Override
    public boolean apply(FoodItem foodItem) {
        return foodItem.getStarRating().getVal() >= starRating.getVal();
    }

    @Override
    public boolean apply(Restaurant restaurant) {
        return restaurant.getStarRating().getVal() >= starRating.getVal();
    }
}
