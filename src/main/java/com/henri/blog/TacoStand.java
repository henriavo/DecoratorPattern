package com.henri.blog;

import com.henri.blog.condiments.Avocado;
import com.henri.blog.condiments.Cilantro;
import com.henri.blog.condiments.Onion;
import com.henri.blog.condiments.Potato;
import com.henri.blog.taco.*;

public class TacoStand {
    public static void main(String[] args) {
        Taco taco = new Chicken();
        System.out.println(taco.getDescription() + " $" + taco.cost());

        Taco taco2 = new Pork();
        taco2 = new Cilantro(taco2);
        taco2 = new Onion(taco2);
        taco2 = new Avocado(taco2);
        System.out.println(taco2.getDescription() + " $" + taco2.cost());

        Taco taco3 = new Veggie();
        taco3 = new Onion(taco3);
        taco3 = new Potato(taco3);
        taco3 = new Avocado(taco3);
        taco3 = new Avocado(taco3); // extra avocado!
        System.out.println(taco3.getDescription() + " $" + taco3.cost());
    }

}
