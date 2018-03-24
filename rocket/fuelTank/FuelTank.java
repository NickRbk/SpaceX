package rocket.fuelTank;

import rocket.fuelTank.type.FuelTanks;

public class FuelTank {
    private String name;
    private int height, width, weight, capacity;

    public FuelTank(String fuelTankType) {
        for(FuelTanks fuelTank : FuelTanks.values()) {
            if(fuelTankType.equals( fuelTank.getName() )) {
                this.name = fuelTank.getName();
                this.height = fuelTank.getHeight();
                this.width = fuelTank.getWidth();
                this.weight = fuelTank.getWeight();
                this.capacity = fuelTank.getCapacity();
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

    public int getCapacity() {
        return capacity;
    }
}