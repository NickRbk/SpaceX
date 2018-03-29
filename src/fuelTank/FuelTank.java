package src.fuelTank;

import src.fuelTank.type.FuelTanks;

public class FuelTank {
    private String name;
    private int height, width, weight, capacity;

    public FuelTank(String fuelTankType) {
        FuelTanks fuelTank = FuelTanks.valueOf(fuelTankType);

        this.name = fuelTank.getName();
        this.height = fuelTank.getHeight();
        this.width = fuelTank.getWidth();
        this.weight = fuelTank.getWeight();
        this.capacity = fuelTank.getCapacity();
    }

    @Override
    public String toString() {
        return String.format("\tFuelTank Type: %s, capacity - %d, dimensions (h: %d, w: %d), weight - %d",
                name, capacity, height, width, weight);
    }

    public int getWeight() {
        return weight;
    }

    public int getCapacity() {
        return capacity;
    }
}
