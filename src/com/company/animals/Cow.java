package com.company.animals;

import com.company.food.Food;

public class Cow extends GrassFeeding{

    public Cow(int id) {
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
