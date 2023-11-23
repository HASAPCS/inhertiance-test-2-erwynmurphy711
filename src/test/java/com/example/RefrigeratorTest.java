package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RefrigeratorTest {

    @Test
    public void testRefrigeratorInitialization() {
        Refrigerator fridge = new Refrigerator("CoolBrand", "CoolModel", 450, 5);
        assertEquals("CoolBrand", fridge.getBrand());
        assertEquals("CoolModel", fridge.getModel());
        assertEquals(450, fridge.getPowerUsage());
        assertEquals(5, fridge.getTemperature());
    }

    @Test
    public void testDisplayInfo() {
        Refrigerator fridge = new Refrigerator("CoolFridge", "FreezeMax", 200, -5);
        String expectedInfo = "Brand: CoolFridge, Model: FreezeMax, Power Usage: 200 Watts, Temperature: -5°C";
        String actualInfo = fridge.displayInfo();
        assertEquals(expectedInfo, actualInfo, "The displayInfo method does not return the correct information.");
    }

    // Additional tests can be added to test the setTemperature method
}
