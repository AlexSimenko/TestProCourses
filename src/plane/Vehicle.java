package plane;

import interF.EngineFlying;
import interF.FuelCombustion;

abstract public class Vehicle implements EngineFlying, FuelCombustion {
    private String model;
    private int year;

    public Vehicle(String model, int year) {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void startEngine() {
        System.out.println("Starting the engine...");
    }
    public void showAge(){
        if (year>=50){
            System.out.println("Old vehicle");
        }
        else {
            System.out.println("Young vehicle");
        }
    }

}
