package com.example;

public class Appliance {
    private String brand;
    private String model;
    private int powerUsage;
    // Attributes
    // TODO: Declare common attributes for electronic devices, such as brand and model and powerUsage.

    // Constructor
    public Appliance(String brand, String model, int powerUsage) {
        this.brand = brand;
        this.model = model;
        this.powerUsage = powerUsage;
        // TODO: Initialize all attributes
    }

    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public int getPowerUsage(){
        return this.powerUsage;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }   
    public void setModel(String model){
        this.model = model;
    }
    public void setPowerUsage(int powerUsage){
        this.powerUsage = powerUsage;
    }
    public String displayInfo(){
        return "Brand: " + getBrand()+ ", Model: "+  getModel()+ ", Power Usage: " + getPowerUsage() + " Watts";
    }
     // Getters
    // TODO: Implement getters for brand, model, and powerUsage

    // displayInfo Method
    // TODO: Implement a method that returns information about the appliance, including brand, model, and power usage.
    // Check the tests for more details

    // isEcoFriendly Method
    // TODO: Implement a method to check if the appliance is eco-friendly based on its power usage. 
    // An appliance that uses less than 400 Watts of power is eco-friendly.

}

