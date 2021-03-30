package com.mycompany.app;

public class Coffee {

    public String type;

    public String testA;

    public double price;

    public Coffee() {}

    public Coffee(String type) {
        this.type = type;
    }

    public void printCoffeePrice(Coffee coffee) {
        System.out.println("Coffee: "+coffee.getType() + " - Price: " +coffee.getPrice());
    }

    public void calculateCoffeePrice(Coffee coffee) throws Exception {

        if (coffee.type.equals("dark")) {

            switch (coffee.type) {
                case "dark": {
                    double ingredients = 0.5;
                    double packaging = 0.7;

                    coffee.setPrice(ingredients + packaging);
                    printCoffeePrice(coffee);
                }
            }

        } else {
            throw new Exception("Invalid input! This calculator can only calculate coffee prices for specific types like: dark");
        }
        
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
