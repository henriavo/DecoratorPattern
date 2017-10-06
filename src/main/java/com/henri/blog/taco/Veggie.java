package com.henri.blog.taco;

import com.henri.blog.taco.Taco;

public class Veggie implements Taco {
    public String description;

    public Veggie(){
        description = "Veggie taco";
    }
    public String getDescription() {
        return this.description;
    }

    public double cost() {
        return 3.99;
    }
}
