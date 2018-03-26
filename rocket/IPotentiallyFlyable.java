package rocket;

import spaceCalculations.SpaceCalculations;

import java.math.BigDecimal;

public interface IPotentiallyFlyable {
    default boolean isPotentiallyFlyable(BigDecimal distanceMeters, float acceleration, int totalWeight,
                                         float efficiency, int totalFuel) {

        BigDecimal fuelNeeds = SpaceCalculations.fuelNeeds(distanceMeters, acceleration, totalWeight, efficiency);

        if(BigDecimal.valueOf(totalFuel).compareTo(fuelNeeds) > 0) {
            System.out.println("You have enough fuel for travel, good luck!");
            return true;
        } else {
            System.out.println("You haven`t enough fuel for travel, you need more "
                    + fuelNeeds.subtract(BigDecimal.valueOf(totalFuel)).toBigInteger());
            return false;
        }

    }
}
