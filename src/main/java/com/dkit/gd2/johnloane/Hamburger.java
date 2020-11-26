package com.dkit.gd2.johnloane;

import java.util.ArrayList;

public class Hamburger
{
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private ArrayList<Topping> toppings;

    public Hamburger(String name, String meat, double price, String breadRollType)
    {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        this.toppings = new ArrayList<Topping>();
    }

    //Need a method add topping, max of 4 toppings
    protected void addTopping(String name, double price)
    {
        Topping addedTopping = new Topping(name, price);
        if(toppings.size() < 4)
        {
            toppings.add(addedTopping);
        }
        else
        {
            System.out.println("Only 4 toppings allowed. Maxed out on toppings");
        }
    }

    public double itemiseHamburger()
    {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + "on a " + this.breadRollType + " roll " + "with " + this.meat + ", price is " + this.price);
        //Now we need to print out up to 4 toppings and their prices
        if(toppings != null)
        {
            for (Topping currentTopping : toppings)
            {
                if(currentTopping.getName() != null)
                {
                    hamburgerPrice += currentTopping.getPrice();
                    System.out.println("Added " + currentTopping.getName() + " for an extra " + currentTopping.getPrice());
                }
            }
        }
        return hamburgerPrice;
    }

    public ArrayList<Topping> getToppings()
    {
        return toppings;
    }
}
