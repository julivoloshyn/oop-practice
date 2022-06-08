package com.company.animals;

import com.company.food.AnimalFood;
import com.company.food.Food;

public abstract class Predator extends Animal{

    public Predator(int id) {
        super(id);
    }

    @Override
    public boolean isEatable(Food food) {
        return food instanceof AnimalFood && this.id != food.id;
    }
}
