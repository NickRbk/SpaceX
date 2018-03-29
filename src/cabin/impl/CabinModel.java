package src.cabin.impl;

import src.cabin.Cabin;
import src.cabin.type.Cabins;
import src.engine.Engine;

public class CabinModel implements Cabin {
    private String name;
    private int height, width, weight, capacity;

    public CabinModel(String cabinType) {
        Cabins cabin = Cabins.valueOf(cabinType);

        this.name = cabin.getName();
        this.height = cabin.getHeight();
        this.width = cabin.getWidth();
        this.weight = cabin.getWeight();
        this.capacity = cabin.getCapacity();
    }

    @Override
    public String toString() {
        return String.format("\nCabin Type: %s, max passengers - %d, dimensions (h: %d, w: %d), weight - %d",
                name, capacity, height, width, weight);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void start(Engine[] engines) {
        System.out.println("\n\n\tPilots in cabin. Turning engines on ...");
        int engineCount = 0;

        for(Engine engine : engines) {
            engineCount++;
            System.out.println(String.format("Engine #%d (%s)... Status: OK", engineCount, engine.getName()));
        }
    }
}
