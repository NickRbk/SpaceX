package rocket.fuelTank.type;

public enum EFuelTank {
    SMALL("small", 90, 2000, 95, 320),
    MEDIUM("medium", 110, 2400, 160, 390),
    LARGE("large", 138, 2900, 110, 430),
    HUGE("huge", 155, 3200, 180, 670),
    TITANIC("titanic", 190, 4100, 78, 820);

    private String name;
    private int height, weight, width, capacity;

    EFuelTank(String name, int height, int weight, int width, int capacity) {
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
