package engine;

import engine.type.Engines;

public class Engine {

    private String name;
    private int height, width, weight, power, fuelConsumption, fuelTankSpace;
    private float acceleration1, acceleration2;

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

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getFuelTankSpace() {
        return fuelTankSpace;
    }

    public float getAcceleration1() {
        return acceleration1;
    }

    public float getAcceleration2() {
        return acceleration2;
    }
}