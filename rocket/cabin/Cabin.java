package rocket.cabin;

import engine.Engine;
import rocket.cabin.type.ECabin;

public class Cabin {
    private String name;
    private int height, width, weight, capacity;
    private static Cabin cabin;

    private Cabin(String cabinType) {
        ECabin cabin = ECabin.valueOf(cabinType);

        this.name = cabin.getName();
        this.height = cabin.getHeight();
        this.width = cabin.getWidth();
        this.weight = cabin.getWeight();
        this.capacity = cabin.getCapacity();
    }

    public static Cabin getCabin(String cabinType) {
        if(cabin == null) {
            return new Cabin(cabinType);
        } else {
            return cabin;
        }
    }

    public String toString() {
        return String.format("\nCabin Type: %s, max passengers - %d, dimensions (h: %d, w: %d), weight - %d",
                name, capacity, height, width, weight);
    }

    public int getWeight() {
        return weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void start(Engine[] engines) {
        System.out.println("\n\n\tPilots in cabin. Turning engines on ...");
        int engineCount = 0;

        for(Engine engine : engines) {
            engineCount++;
            System.out.println(String.format("Engine #%d (%s)... Status: OK", engineCount, engine.getName()));
        }
    }
}
