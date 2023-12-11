package com.solvd.foodDelivery.order;

public enum TodaysSpecial {
    BREAKFAST("Spicy Poblano Omelette", "Scrambled Eggs with Bacon", "Breakfast Sampler", "Breakfast Burrito"),
    LUNCH("Classic Cheeseburger", "BBQ Pulled Pork Sandwich", "Chicken and Waffles", "Grilled Cheese and Tomato Soup Combo"),
    DINNER("Herb-Roasted Chicken", "Grilled Salmon with Lemon Butter Sauce", "Chicken Alfredo Pasta", "Vegetarian Stuffed Bell Peppers"),
    FAST_FOOD("Fast Food Special", "Cheeseburger", "French Fries", "Soda");
    private final String mainCourse1;
    private final String mainCourse2;
    private final String mainCourse3;
    private final String mainCourse4;
    TodaysSpecial( String mainCourse1, String mainCourse2, String mainCourse3, String mainCourse4) {
        this.mainCourse1 = mainCourse1;
        this.mainCourse2 = mainCourse2;
        this.mainCourse3 = mainCourse3;
        this.mainCourse4 = mainCourse4;
    }

    public String getMainCourse1() {
        return mainCourse1;
    }

    public String getMainCourse2() {
        return mainCourse2;
    }

    public String getMainCourse3() {
        return mainCourse3;
    }

    public String getMainCourse4() {
        return mainCourse4;
    }

    @Override
    public String toString() {
        return "Today's Special{" + mainCourse1 + ", " + mainCourse2 + ", " + mainCourse3 + ", " + mainCourse4 + ", " + '}';
    }
}
