// package com.example;

// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;

// public class BonusTest {

//     @Test
//     public void testAddFoodItem() {
//         Refrigerator fridge = new Refrigerator("CoolBrand", "ModelX", 350, 5);
//         fridge.addFoodItem("Milk");
//         fridge.addFoodItem("Eggs");
//         String[] expectedItems = {"Milk", "Eggs", null, null, null};
//         assertArrayEquals(expectedItems, fridge.getFoodItems(), "The food items should match what was added");
//     }

//     @Test
//     public void testAddFoodItemWhenFull() {
//         Refrigerator fridge = new Refrigerator("CoolBrand", "ModelX", 350, 5);
//         for (int i = 0; i < 5; i++) {
//             fridge.addFoodItem("Item " + i);
//         }
//         assertFalse(fridge.addFoodItem("Extra Item"), "Should not be able to add an extra item when fridge is full");
//         String[] expectedItems = {"Item 0", "Item 1", "Item 2", "Item 3", "Item 4"};
//         assertArrayEquals(expectedItems, fridge.getFoodItems(), "The food items should match the maximum capacity");
//     }

//     @Test
//     public void testRemoveFoodItem() {
//         Refrigerator fridge = new Refrigerator("CoolBrand", "ModelX", 350, 5);
//         fridge.addFoodItem("Butter");
//         fridge.removeFoodItem("Butter");
//         String[] expectedItems = {null, null, null, null, null};
//         assertArrayEquals(expectedItems, fridge.getFoodItems(), "The fridge should be empty after removing the item");
//     }

//     @Test
//     public void testRemoveFoodItemNotInFridge() {
//         Refrigerator fridge = new Refrigerator("CoolBrand", "ModelX", 350, 5);
//         fridge.addFoodItem("Cheese");
//         fridge.removeFoodItem("Yogurt");
//         String[] expectedItems = {"Cheese", null, null, null, null};
//         assertArrayEquals(expectedItems, fridge.getFoodItems(), "The food items should remain unchanged when trying to remove a non-existent item");
//     }
// }
