package com.dkit.gd2.johnloane;

/**
 * Burger example
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /* Create an application to help Zak's Burgers to help sell burgers
        Should be able to sell different types of burgers with different toppings
        at different prices
        We want a base burger class, but also two types of burgers
        The basic hamburger should have the following:
        bread roll type, meat and up to 4 addition items (lettuce, tomatoe, carrot)
        that can customer can select and add to the burger
        Each item has an additional cost so need to track the items added and their
        cost to calculate the final price
        Create a Hamburger class to deal with the above
        The constructor should only include roll type, meat, price, can also include name
        There are two subclasses
        2) Healthy burger (on a brown rye roll), plus two additional items
        There are an additional 6 toppings that you can add
        3) Deluxe burger cames with chips and drinks, but no extra toppings.
        All three burgers should have a method that can be called at any time to
        show the base price of the burger, plus all additions, should show each addition
        name and price and a final total cost.
         */
        Hamburger quarterPounder = new Hamburger("Quarter Pounder", "Beef", 5.00, "White");
        quarterPounder.addTopping("Carrot", 0.50);
        quarterPounder.addTopping("Pineapple", 0.50);
        quarterPounder.addTopping("Lettuce", 0.50);

        double finalPrice =quarterPounder.itemiseHamburger();
        System.out.printf("Total cost: %.2f ", finalPrice);

    }
}
