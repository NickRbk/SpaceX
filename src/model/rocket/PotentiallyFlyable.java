package src.model.rocket;

import src.calculation.SpaceTravel;

import java.math.BigDecimal;

public interface PotentiallyFlyable {
    default boolean isPotentiallyFlyable(BigDecimal distanceMeters, float acceleration, int totalWeight,
                                         float efficiency, int totalFuel) {

        BigDecimal fuelNeeds = SpaceTravel.fuelNeeds(distanceMeters, acceleration, totalWeight, efficiency);

        if(BigDecimal.valueOf(totalFuel).compareTo(fuelNeeds) > 0) {
            System.out.println("\n\tYou have enough fuel for travel, good luck!");
            return true;
        } else {
            System.out.println("\nYou haven`t enough fuel for travel, you need more "
                    + fuelNeeds.subtract(BigDecimal.valueOf(totalFuel)).toBigInteger());
            return false;
        }

    }
}
