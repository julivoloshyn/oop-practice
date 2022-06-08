package com.company.animals;

import com.company.food.Food;

public class Goat extends GrassFeeding{

    public Goat(int id) {
        super(id);
    }

    @Override
    public void eat(Food food) {

        if(isEatable(food)) {
            System.out.println("eatable");
        } else {
            System.out.println("not eatable");
        }
    }
}
