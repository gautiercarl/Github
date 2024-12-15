package Praktikum4;
import java.util.*;

public class Plant {
    private double height;
    private String type;
    private int waterLevel;

    public double getHeight() {
        return height;
    }

    public String getType(){
        return type;
    }

    public int getWaterLevel(){
        return waterLevel;
    }

    public void setHeight(double height){
        if(height>0.0) {
            this.height=height;
        } else {
            System.out.println("Error");
        }
    }

    public void setType(String type){
        this.type=type;
    }

    public void setWaterLevel(int waterLevel){
        if(waterLevel<10){
            this.waterLevel=waterLevel;
        } else {
            System.out.println("Error");
        }    
    }

    public void grow(int sunlightHours){
        if (sunlightHours>0) {
            height=height+(0.5*sunlightHours);
            System.out.println("The height is: " +height);
        } else {
            System.out.println("error " ); 
        }
    }

    public void water(int amount){ 
        if (amount>0) {
            waterLevel=amount;
            System.out.println("The water level is: " +waterLevel);
        } else{
            System.out.println("error " ); 
        }
    }

    public boolean needsWater(){
        if (waterLevel<5){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean equals(Plant other) {
        if (type.equals(other.getType()) == false) {
            return false;
        }

        /*if (waterLevel != other.getWaterLevel()) {
            return false;
        }*/

        if (height != other.getHeight()) {
            return false;
        }

        return true;  
    }
}