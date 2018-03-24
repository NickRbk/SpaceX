package rocket.cabin;

import rocket.cabin.type.Cabins;

public class Cabin {
    private String name;
    private int height, width, weight, capacity;
    private static Cabin cabin;

    private Cabin(String cabinType) {
        for(Cabins cabin : Cabins.values()) {
            if(cabinType.equals( cabin.getName() )) {
                this.name = cabin.getName();
                this.height = cabin.getHeight();
                this.width = cabin.getWidth();
                this.weight = cabin.getWeight();
                this.capacity = cabin.getCapacity();
            }
        }
    }

    public static Cabin getCabin(String cabinType) {
        if(cabin == null) {
            return new Cabin(cabinType);
        } else {
            return cabin;
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

    public static Cabin getCabin() {
        return cabin;
    }

    public void start(int rocketCapacity) {
//        engine = new Engine(rocketCapacity);
        System.out.println("Start engine!");
    }
}
