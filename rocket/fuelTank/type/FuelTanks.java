package rocket.fuelTank.type;

public enum FuelTanks {
    SMALL("small", 90, 2000, 140, 12600),
    MEDIUM("medium", 110, 2400, 160, 17600),
    LARGE("large", 138, 2900, 130, 17940),
    HUGE("huge", 155, 3200, 180, 27900),
    TITANIC("titanic", 190, 3400, 78, 14820);

    private String name;
    private int height, weight, width, capacity;

    FuelTanks(String name, int height, int weight, int width, int capacity) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.width = width;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getWidth() {
        return width;
    }

    public int getCapacity() {
        return capacity;
    }
}
