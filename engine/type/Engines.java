package engine.type;

public enum Engines {
    SLOW("Slow", 100, 150, 3000, 40, 140, 15000, 9.6f, 11.2f),
    ECONOMY("Economy", 120, 170, 2700, 60, 100, 20400, 9.7f, 11.5f),
    SUPER_FAST("SuperFast", 160, 80, 1200, 100, 250, 12800, 12.6f, 18.5f),
    FAST("Fast", 140, 110, 1700, 90, 230, 15400, 10.2f, 14.5f),
    OLD("Old", 200, 250, 4000, 20, 300, 50000, 4.7f, 4.9f);

    private String name;
    private int height, width, weight, power, fuelConsumption, fuelTankSpace;
    private float acceleration1, acceleration2;

    Engines(String name, int height, int width, int weight, int power, int fuelConsumption,
            int fuelTankSpace, float acceleration1, float acceleration2) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.fuelTankSpace = fuelTankSpace;
        this.acceleration1 = acceleration1;
        this.acceleration2 = acceleration2;
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

    public int getPower() {
        return power;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getFuelTankSpace() {
        return fuelTankSpace;
    }

    public float getAcceleration1() {
        return acceleration1;
    }

    public float getAcceleration2() {
        return acceleration2;
    }
}
