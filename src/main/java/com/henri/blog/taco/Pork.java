package com.henri.blog.taco;

public class Pork implements Taco {
    public String description;

    public Pork(){
        description = "Pork taco";
    }
    public String getDescription() {
        return this.description;
    }

    public double cost() {
        return 2.75;
    }
}
