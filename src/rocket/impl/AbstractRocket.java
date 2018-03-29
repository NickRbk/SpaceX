package src.rocket.impl;

import src.cabin.Cabin;
import src.cabin.impl.AbstractCabin;
import src.engine.Engine;
import src.fuelTank.FuelTank;
import src.rocket.PotentiallyFlyable;
import src.rocket.Rocket;

public abstract class AbstractRocket implements Rocket, PotentiallyFlyable {

    private int weight;

    private Cabin cabin;
    private Engine[] engines;
    private FuelTank[] fuelTanks;

    AbstractRocket(int weight) {
        this.weight = weight;
    }

    @Override
    public void assembleRocket(String cabin, Engine[] engines, FuelTank[] fuelTanks) {
        setCabin(cabin);
        setEngines(engines);
        setFuelTanks(fuelTanks);
    }

    @Override
    public void start() {
        this.cabin.start(this.engines);
    }

    private void setCabin(String cabinType) {
        if(this.cabin == null) {
            this.cabin = new AbstractCabin(cabinType);
        } else {
            System.out.println(String.format("Sorry, your AbstractRocket has the cabin '%s'", this.cabin.getName()));
        }
    }

    private void setEngines(Engine[] engines) {
        this.engines = engines;
    }

    private void setFuelTanks(FuelTank[] fuelTanks) {
        this.fuelTanks = fuelTanks;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public float getAccelerationAverage() {
        float total = 0f;
        int counts = this.engines.length;

        for(Engine engine : engines) {
            total += ( engine.getAcceleration1() + engine.getAcceleration2() ) / 2;
        }

        return total / counts;
    }

    @Override
    public int getTotalWeight() {
        int totalEngineWeight = 0;
        int totalFuelTankWeight = 0;

        for(Engine engine : engines) {
            totalEngineWeight += engine.getWeight();
        }

        for(FuelTank fuelTank : fuelTanks) {
            totalFuelTankWeight += fuelTank.getWeight();
        }

        return getWeight() + totalEngineWeight + totalFuelTankWeight + this.cabin.getWeight() + this.cabin.getCapacity() * 80;
    }

    @Override
    public int getTotalFuel() {
        int totalFuel = 0;

        for(FuelTank fuelTank : fuelTanks) {
            totalFuel += fuelTank.getCapacity();
        }

        return totalFuel;
    }

    @Override
    public float getEfficiencyAverage() {
        float total = 0f;
        int counts = this.engines.length;

        for(Engine engine : engines) {
            total += engine.getPower();
        }

        return total / counts;
    }

    @Override
    public void getCabin() {
        System.out.println(cabin.toString());
    }

    @Override
    public void getEngines() {
        System.out.println("\nYour spaceship has the below engines: ");
        for(Engine engine : engines) {
            System.out.println(engine.toString());
        }
    }

    @Override
    public void getFuelTanks() {
        System.out.println("\nYour spaceship has the below fuel tanks: ");
        for(FuelTank fuelTank : fuelTanks) {
            System.out.println(fuelTank.toString());
        }
    }
}
