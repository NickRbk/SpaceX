package destinations;

import java.math.BigDecimal;

public enum EPlanet {
    MARS(0.52f, "Mars"), JUPITER(4.2f, "Jupiter"), SATURN(8.52f, "Saturn"),
    URANUS(18.21f, "Uranus"), NEPTUNE(29.09f, "Neptune");

    private float distance;  // light-years unit (from Earth)
    private String name;

    EPlanet(float distance, String name) {
        this.distance = distance;
        this.name = name;
    }

    // set getters for destination and name
    public float getDistanceLightYears() {
        return distance;
    }

    public BigDecimal getDistanceMeters() {
        return BigDecimal.valueOf(distance).multiply(BigDecimal.valueOf(SpaceConstants.METER_LIGHT_YEAR));
    }

    public String getName() {
        return name;
    }
}
