package FoodDeliverySystem.data;

import java.util.List;

public class Restaurant {
    private final int id;
    private final String name;
    private final String description;
    private final MealType mealType;
    private final List<CuisineType> offeredCuisines;
    private final StarRating starRating;
    private final Menu menu;

    public Restaurant(int id, String name, String description, MealType mealType, List<CuisineType> offeredCuisines, StarRating starRating, Menu menu) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.mealType = mealType;
        this.offeredCuisines = offeredCuisines;
        this.starRating = starRating;
        this.menu = menu;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public MealType getMealType() {
        return mealType;
    }

    public List<CuisineType> getOfferedCuisines() {
        return offeredCuisines;
    }

    public StarRating getStarRating() {
        return starRating;
    }

    public Menu getMenu() {
        return menu;
    }
}
