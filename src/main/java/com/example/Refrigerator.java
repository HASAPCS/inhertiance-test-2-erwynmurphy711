package com.example;

// TODO: make this class extend Appliance

public class Refrigerator extends Appliance {
    // Additional attributes
    private int temperature;
    private String[] fridge = new String[5];

    public Refrigerator(String brand, String model, int powerUsage, int temperature) {
        super(brand, model, powerUsage);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean addFoodItem(String food) {
        String item = food;
        int count = 0;
        for (int i = 0; i < fridge.length; i++) {
            if (fridge[i] != null) {
                count++;
            }
        }
        if (count == fridge.length) {
            return false;
        } else {
            for (int i = 0; i < fridge.length; i++) {
                if (fridge[i] == null) {
                    fridge[i] = item;
                    break;
                }
            }
        }
        return true;
    }

    public void removeFoodItem(String food) {
        for (int i = 0; i < fridge.length; i++) {
            if (fridge[i] == food) {
                fridge[i] = null;
                break;
            }
        }
    }

    public String[] getFoodItems() {
        return fridge;
    }

    public String displayInfo() {
        return "Brand: " + getBrand() + ", Model: " + getModel() + ", Power Usage: " + getPowerUsage()
                + " Watts, Temperature: " + getTemperature() + "°C";
    }
    // Constructor
    // TODO: Initialize the Refrigerator with brand, model, power usage, temperature

    // Override displayInfo Method from Appliance
    // TODO: Implement a method that extends the information display to include the
    // refrigerator's specific details (temperature)

    // setTemperature Method
    // TODO: Implement a method to set the temperature of the refrigerator

    // Optional Bonus Tasks for additional marks:
    // =========================================

    // TODO (Bonus): Add two additional attributes: `foodItems` (a String array) and
    // `itemCount` (an int).
    // `foodItems` will hold the names of food items in the refrigerator, and
    // `itemCount` will track the number of items.
    // Initialize `foodItems` to a length of 5 in the constructor and `itemCount` to
    // 0.

    // TODO (Bonus): Write the `addFoodItem(String foodItem)` method.
    // This method should add a new food item to the refrigerator if it is possible.
    // Check the test file to ensure you have the correct implementation.
    // If the item was added, the method should return true. Otherwise false.

    // TODO (Bonus): Write the `removeFoodItem(String foodItem)` method.
    // This method should remove a food item from the refrigerator if it exists.
    // Again, check the test file to ensure you have the correct implementation.
    // If the item has been removed it should return true, otherwise false.

    // TODO (Bonus): Write the `getFoodItems()` method.
    // This method should return the current list of food items in the refrigerator.
}
