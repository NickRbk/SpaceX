package engine;

public class Engine implements IConsumable {

    private int capacity;

    public Engine(int capacity) {
        this.capacity = capacity;
    }

    public int getFuelConsumption() {
        int fuelConsumption = this.capacity / 2 ; // some logic to calc fuel consumption

        System.out.println("Fuel consumption is " + fuelConsumption + " per one destination unit");

        return fuelConsumption;
    }

    public static int getFuelNeeds(int fuelConsumption, int distance) {
        return fuelConsumption * distance;
    }

    public static int getAdditionalFuelNeeds(int fuelConsumption, int distance, int tankVolume) {
        return getFuelNeeds(fuelConsumption, distance) - tankVolume;
    }
}