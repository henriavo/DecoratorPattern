package com.henri.blog.taco;

public class Chicken implements Taco {
    public String description;

    public Chicken(){
        description = "Chicken taco";
    }
    public String getDescription() {
        return this.description;
    }

    public double cost() {
        return 2.49;
    }
}
