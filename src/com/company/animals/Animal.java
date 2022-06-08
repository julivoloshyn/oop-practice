package com.company.animals;

import com.company.food.AnimalFood;
import com.company.food.Food;

public abstract class Animal extends AnimalFood {

    public Animal(int id) {
        super(id);
    }

    public abstract void eat(Food food);
}
