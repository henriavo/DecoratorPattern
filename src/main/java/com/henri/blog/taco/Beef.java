package com.henri.blog.taco;

public class Beef implements Taco {

    public String description;

    public Beef(){
        description = "Beef taco";
    }
    public String getDescription() {
        return this.description;
    }

    public double cost() {
        return 2.99;
    }
}
