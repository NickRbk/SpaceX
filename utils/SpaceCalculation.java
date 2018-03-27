package utils;

import destination.SpaceConstant;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SpaceCalculation {

    // Observer time elapsed during journey. It's time in trip for people on Earth
    // Cuz formula for calc big it divided to several parts in code below
    public static BigDecimal observerTravelTime(BigDecimal distanceMeters, float acceleration) {

        BigDecimal part1_1 = BigDecimal.valueOf( SpaceConstant.LIGHT_SPEED).pow(2).multiply(BigDecimal.valueOf(2))
                .divide(BigDecimal.valueOf(acceleration), 20, RoundingMode.HALF_UP);

        BigDecimal part1 = distanceMeters.divide(part1_1, 20, RoundingMode.HALF_UP).add(BigDecimal.valueOf(1))
                .pow(2).subtract(BigDecimal.valueOf(1));

        BigDecimal part2 = BigDecimal.valueOf(SpaceConstant.LIGHT_SPEED).pow(2)
                .divide(BigDecimal.valueOf(acceleration).pow(2), 20, RoundingMode.HALF_UP).multiply(part1);

        return BigDecimal.valueOf(StrictMath.sqrt(part2.doubleValue())).multiply(BigDecimal.valueOf(2));
    }

    // Calculate spacecraft maximum velocity
    // Cuz formula for calc big it divided to several parts in code below
    private static BigDecimal maximumVelocity(BigDecimal distanceMeters, float acceleration) {

        BigDecimal observerTravelTime = observerTravelTime(distanceMeters, acceleration);

        BigDecimal part1_1 = BigDecimal.valueOf(acceleration).pow(2).multiply(
                observerTravelTime.divide(BigDecimal.valueOf(2), 20, RoundingMode.HALF_UP).pow(2)
        );

        BigDecimal part1 = BigDecimal.valueOf(1).add(
                BigDecimal.valueOf(SpaceConstant.LIGHT_SPEED).pow(2).divide(part1_1, 20, RoundingMode.HALF_UP)
        );

        BigDecimal part2 = BigDecimal.valueOf(StrictMath.sqrt(part1.doubleValue()));

        return BigDecimal.valueOf(SpaceConstant.LIGHT_SPEED).divide(part2, 20, RoundingMode.HALF_UP);
    }

    // Calculate fuel needs for travel
    // Cuz formula for calc big it divided to several parts in code below
    public static BigDecimal fuelNeeds(BigDecimal distanceMeters, float acceleration, int totalWeight, float efficiency) {
        return fuelNeedsPerKilogram(distanceMeters, acceleration)
                .multiply(BigDecimal.valueOf(totalWeight)).divide(BigDecimal.valueOf(efficiency), 20, RoundingMode.HALF_UP);
    }

    // Calculate fuel needs per kilogram
    // Cuz formula for calc big it divided to several parts in code below
    private static BigDecimal fuelNeedsPerKilogram(BigDecimal distanceMeters, float acceleration) {

        BigDecimal part1 = maximumVelocity(distanceMeters, acceleration)
                .divide(BigDecimal.valueOf(SpaceConstant.LIGHT_SPEED), 20, RoundingMode.HALF_UP);

        return part1.multiply(BigDecimal.valueOf(2)).divide(BigDecimal.valueOf(1).subtract(part1),20, RoundingMode.HALF_UP);
    }
}
