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
}