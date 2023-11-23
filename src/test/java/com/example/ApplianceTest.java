package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ApplianceTest {
    @Test
    public void testDisplayInfo() {
        Appliance appliance = new Appliance("BrandX", "ModelY", 500);
        String expectedInfo = "Brand: BrandX, Model: ModelY, Power Usage: 500 Watts";
        String actualInfo = appliance.displayInfo();
        assertEquals(expectedInfo, actualInfo, "The displayInfo method does not return the correct information.");
    }

}
