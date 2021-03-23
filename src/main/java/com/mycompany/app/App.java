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

    }
}
