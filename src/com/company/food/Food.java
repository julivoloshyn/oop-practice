package com.company.food;

public abstract class Food {

    public int id;

    public Food(int id) {
        this.id = id;
    }

    public abstract boolean isEatable(Food food);
}
