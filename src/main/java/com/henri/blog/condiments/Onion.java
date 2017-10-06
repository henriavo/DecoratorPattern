package com.henri.blog.condiments;

import com.henri.blog.taco.Taco;

public class Onion extends CondimentDecorator {
    Taco taco;

    public Onion(Taco taco){
        this.taco = taco;
    }

    public String getDescription() {
        return taco.getDescription() + ", Onion";
    }

    public double cost() {
        return .10 + taco.cost();
    }
}
