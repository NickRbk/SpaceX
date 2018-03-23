package engine.type;

public enum Engines {
    SLOW("Slow", 100, 150, 3000, 40, 140, 15000, 35, 40),
    ECONOMY("Economy", 120, 170, 2700, 60, 100, 20400, 50, 50),
    SUPER_FAST("SuperFast", 160, 80, 1200, 100, 250, 12800, 60, 80),
    FAST("Fast", 140, 110, 1700, 90, 230, 15400, 70, 60),
    OLD("Old", 200, 250, 4000, 20, 300, 50000, 20, 20);

    private String name;
    private int height, width, weight, power, fuelConsumption, fuelTankSpace, acceleration1, acceleration2;

    Engines(String name, int height, int width, int weight, int power, int fuelConsumption,
            int fuelTankSpace, int acceleration1, int acceleration2) {
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

    public int getAcceleration1() {
        return acceleration1;
    }

    public int getAcceleration2() {
        return acceleration2;
    }
}
