package com.company.animals;

import com.company.food.Food;

public abstract class GrassFeeding extends Animal{

    public GrassFeeding(int id) {
        super(id);
    }

    @Override
     public boolean isEatable(Food food) {
        return food instanceof GrassFeeding;
    }
}
