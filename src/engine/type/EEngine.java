package src.engine.type;

public enum EEngine {
    SLOW("slow", 100, 150, 3000, 0.4f, 140, 15000, 9.6f, 11.2f),
    ECONOMY("economy", 120, 170, 2700, 0.6f, 100, 20400, 9.7f, 11.5f),
    SUPERFAST("superFast", 160, 100, 1200, 0.8f, 250, 12800, 12.6f, 18.5f),
    FAST("fast", 160, 190, 1700, 0.9f, 230, 15400, 10.2f, 14.5f),
    OLD("old", 200, 250, 4000, 0.2f, 300, 50000, 4.7f, 4.9f);

    private String name;
    private int height, width, weight, fuelConsumption, fuelTankSpace;
    private float power, acceleration1, acceleration2;

    EEngine(String name, int height, int width, int weight, float power, int fuelConsumption,
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

    public float getPower() {
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
