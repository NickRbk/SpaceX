package destinations;

public enum Planets {
    MARS(100, "Mars"), MOON(4, "Moon");

    private int destination;
    private String name;

    Planets(int destination, String name) {
        this.destination = destination;
        this.name = name;
    }

    // set getters for destination and name
    public int getDestination() {
        return destination;
    }

    public String getName() {
        return name;
    }
}
