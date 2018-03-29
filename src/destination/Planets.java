package src.destination;

import src.calculation.SpaceConstant;

import java.math.BigDecimal;

public enum Planets {
    MARS(0.52f, "Mars"), JUPITER(4.2f, "Jupiter"), SATURN(8.52f, "Saturn"),
    URANUS(18.21f, "Uranus"), NEPTUNE(29.09f, "Neptune");

    private float distance;  // astronomical unit (from Earth)
    private String name;

    Planets(float distance, String name) {
        this.distance = distance;
        this.name = name;
    }

    // set getters for src.destination and name
    public float getDistanceLightYears() {
        return distance;
    }

    public BigDecimal getDistanceMeters() {
        return BigDecimal.valueOf(distance).multiply(BigDecimal.valueOf(SpaceConstant.AU));
    }

    public String getName() {
        return name;
    }
}
