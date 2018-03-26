package rocket.cabin.type;

public enum ECabin {
    COMFORT("comfort", 3, 20, 900, 5),
    VIP("VIP", 5, 50, 1400, 2),
    DELUX("delux", 5, 70, 2100, 8),
    COSY("cosy", 2, 30, 800, 7),
    ECONOMY("economy", 1, 10, 600, 10);

    private String name;
    private int height, width, weight, capacity;

    ECabin(String name, int height, int width, int weight, int capacity) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.capacity = capacity;
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
}
