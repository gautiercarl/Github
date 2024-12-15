package Praktikum4;

import java.util.*;

public class PlantTestDrive {
    public static void main(String[] args) {

        Plant plant1 = new Plant();
        // plant1.height=10.0;
        // System.out.println("The height is: " +plant1.height);
        plant1.setHeight(5.5);
        plant1.setType("Rose");
        plant1.setWaterLevel(0);

        plant1.setHeight(-2);
        plant1.setWaterLevel(10);

        System.out.println(plant1.getHeight());
        System.out.println(plant1.getType());
        System.out.println(plant1.getWaterLevel());

        plant1.grow(2);
        plant1.grow(4);
        plant1.grow(6);
        plant1.grow(8);
        plant1.grow(-8); // The height is: -4.0

        plant1.water(2);
        plant1.water(3);
        // negativ plant1.water(-2); // negativ
        System.out.println(plant1.needsWater());
        if (plant1.needsWater()) {
            System.out.println("Please add somme water");
            plant1.water(7);
            System.out.println(plant1.needsWater());

        }

        double height1;
        double height2;
        height1 = 5;
        height2 = 5;
        System.out.println(height1 == height2);

        Plant plant2 = new Plant();
        plant2.setHeight(1.0);
        plant2.setType("cactus");
        plant2.setWaterLevel(3);

        plant1.setHeight(1.0);
        plant1.setType("cactus");
        plant1.setWaterLevel(3);

        System.out.println(plant1 == plant2); // False Die Referenzen sind nicht gleich

        plant1.setType("cactus");
        plant2.setType("rose");

        plant1.getType().equals(plant2.getType());

        Plant plant3 = new Plant();
        plant3.setType("Tulpe");
        plant3.setHeight(2);
        plant3.setWaterLevel(6);

        Plant plant4 = new Plant();
        plant4.setType("Tulpe");
        plant4.setHeight(3);
        plant4.setWaterLevel(6);

        System.out.println("plant3 == plant4: " + plant3.equals(plant4));
    }
}
