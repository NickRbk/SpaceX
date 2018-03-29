package src.model.engine.impl;

import src.model.engine.Engine;
import src.model.engine.type.Engines;

public class EngineModel implements Engine {

    private String name;
    private int height, width, weight, fuelConsumption, fuelTankSpace;
    private float power, acceleration1, acceleration2;

    public EngineModel(String engineType) {
        Engines engine = Engines.valueOf(engineType);

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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public float getPower() {
        return power;
    }

    @Override
    public float getAcceleration1() {
        return acceleration1;
    }

    @Override
    public float getAcceleration2() {
        return acceleration2;
    }
}