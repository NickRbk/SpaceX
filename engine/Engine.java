package engine;

import engine.type.Engines;

public class Engine {

    String name;
    int height, width, weight, power, fuelConsumption, fuelTankSpace, acceleration1, acceleration2;

    public Engine(String engineType) {
        for(Engines engine : Engines.values()) {
            if(engineType.equals( engine.getName() )) {
                this.name = engine.getName();
                this.height = engine.getHeight();
                this.width = engine.getWidth();
                this.weight = engine.getWeight();
                this.power = engine.getPower();
                this.fuelConsumption = engine.getFuelConsumption();
                this.fuelTankSpace = engine.getFuelTankSpace();
                this.acceleration1 = engine.getAcceleration1();
                this.acceleration2 = engine.getAcceleration2();
            }
        }
    }


//    private int capacity;
//
//    public Engine(int capacity) {
//        this.capacity = capacity;
//    }
//
//    public int getFuelConsumption() {
//        int fuelConsumption = this.capacity / 2 ; // some logic to calc fuel consumption
//
//        System.out.println("Fuel consumption is " + fuelConsumption + " per one destination unit");
//
//        return fuelConsumption;
//    }
//
    public static int getFuelNeeds(int fuelConsumption, int distance) {
        return fuelConsumption * distance;
    }

    public static int getAdditionalFuelNeeds(int fuelConsumption, int distance, int tankVolume) {
        return getFuelNeeds(fuelConsumption, distance) - tankVolume;
    }
}