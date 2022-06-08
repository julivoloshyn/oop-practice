package com.company;

import com.company.animals.Cow;
import com.company.animals.Goat;
import com.company.animals.Lion;
import com.company.food.Grass;

public class Main {

    public static void main(String[] args) {

        Grass grass = new Grass(0);
        Cow cow = new Cow(1);
        Goat goat = new Goat(2);
        Lion lion = new Lion(3);
        Lion lion1 = new Lion(4);

        lion.eat(goat);
        lion.eat(lion1);
        lion.eat(grass);
        lion.eat(lion);
        cow.eat(lion);
        cow.eat(goat);
        cow.eat(grass);

    }
}
