package com.company.food;

public class Grass extends GrassFood{

    public Grass(int id) {
        super(id);
    }

    @Override
    public boolean isEatable(Food food) {
        return food instanceof GrassFood;
    }
}
