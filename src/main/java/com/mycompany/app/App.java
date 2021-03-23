package com.mycompany.app;

/**
 * Hello world!
 */

public class App
{

    public App() {}

    public static void main(String[] args) throws Exception {

        // Calculate coffeeA price and print it:
        Coffee coffeeA = new Coffee("dark");
        coffeeA.calculateCoffeePrice(coffeeA);

        // Calculate coffeeB price and print it:
        CoffeeWithTaste coffeeB = new CoffeeWithTaste("milk");
        coffeeB.calculateCoffeePrice(coffeeB);
//
//        // Test exception:
//        CoffeeWithTaste coffeeC = new CoffeeWithTaste("blue");
//        coffeeC.calculateCoffeePrice(coffeeC);
//        System.out.println(coffeeC.getPrice());

    }
}
