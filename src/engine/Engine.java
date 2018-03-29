package src.engine;

import src.engine.type.EEngine;

public class Engine {

    private String name;
    private int height, width, weight, fuelConsumption, fuelTankSpace;
    private float power, acceleration1, acceleration2;

    public Engine(String engineType) {
        EEngine engine = EEngine.valueOf(engineType);

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

    @Override
    public String toString() {
        return String.format("\tEngine Type: %s, power - %f, dimensions (h: %d, w: %d), " +
                        "weight - %d, tank space - %d || Acceleration#1 (%f), Acceleration#2 (%f) " +
                        "|| Fuel consumption = %d",
                name, power, height, width, weight, fuelTankSpace, acceleration1, acceleration2, fuelConsumption);
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

    public float getPower() {
        return power;
    }

    public float getAcceleration1() {
        return acceleration1;
    }

    public float getAcceleration2() {
        return acceleration2;
    }
}