package com.dkit.gd2.johnloane;

public class HealthyBurger extends Hamburger
{
    final int MAX_TOPPINGS_FOR_HEALTHY_BURGER = 6;

    public HealthyBurger(String meat, double price)
    {
        super("Healthy", meat, price, "Brown Rye");
    }

    @Override
    protected void addTopping(String name, double price)
    {
        Topping addedTopping = new Topping(name, price);
        if(this.getToppings().size() < MAX_TOPPINGS_FOR_HEALTHY_BURGER)
        {
            this.getToppings().add(addedTopping);
        }
        else
        {
            System.out.println("Only 6 toppings allowed. Maxed out on toppings");
        }
    }
}
