package FoodDeliverySystem.controller;

import FoodDeliverySystem.data.User;
import FoodDeliverySystem.managers.CartManager;

public class AddToCart {
    private final CartManager cartManager;

    public AddToCart(CartManager cartManager) {
        this.cartManager = cartManager;
    }

    public void addToCart(String userToken, int foodItemId, int restaurantId) throws IllegalAccessException {
        if(userToken == null || userToken.length() == 0)
            throw new IllegalAccessException("invalid user token");
        User user;
        if(UserAuthorization.validateUserToken(userToken))
            user = UserAuthorization.getUserByToken(userToken);
        else
            throw new IllegalAccessException();

        cartManager.addItemToCart(user, foodItemId, restaurantId);
    }
}
