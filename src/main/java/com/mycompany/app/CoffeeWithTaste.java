package com.mycompany.app;

public class CoffeeWithTaste extends Coffee {

    public CoffeeWithTaste(String type) {
        super(type);
    }

    @Override
    public void calculateCoffeePrice(Coffee coffee) throws Exception {

        if (coffee.type.equals("dark") || coffee.type.equals("milk") || coffee.type.equals("espresso")) {

            switch (coffee.type) {
                case "dark": {
                    double ingredients = 0.5;
                    double packaging = 0.7;

                    coffee.setPrice(ingredients + packaging);
                }
                case "milk": {
                    double ingredients = 0.8;
                    double packaging = 0.7;

                    coffee.setPrice(ingredients + packaging);
                }
                case "espresso": {
                    double ingredients = 1.2;
                    double packaging = 0.7;

                    coffee.setPrice(ingredients + packaging);
                }
            }

        } else {
            throw new Exception("Invalid input! This calculator can only calculate coffee prices for specific types like: dark, milk and espresso.");
        }
    }
}
