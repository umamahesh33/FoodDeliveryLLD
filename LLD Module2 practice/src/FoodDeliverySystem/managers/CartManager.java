package FoodDeliverySystem.managers;

import FoodDeliverySystem.data.User;

public class CartManager {
    public void addItemToCart(User user, int foodItemId, int restaurantId) {
        if(foodItemId < 0 || restaurantId < 0)
            throw new IllegalArgumentException("invalid params data");
        if(userCartExist(user)){
            Cart cart = getUserCart(user);
            if(cart.getRestaurantId == restaurantId){
                
            } else {
                // send a confirmation that whether we need to delete the existing cart and continue with the new cart
            }
        }
    }
}
