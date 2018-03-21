package interfaces;

import enums.Planets;

public interface IsSuccessFly {

    // define method same to all space rocket
    // calc is you can access your destination
    default void isSuccessFly(Planets planet, int tankVolume, int fuelConsumption) {
        int fuelNeeds = fuelConsumption * planet.getDestination();

        if(fuelNeeds > tankVolume) {
            int additionalFuel = fuelNeeds - tankVolume;
            System.out.println("\nSorry but you need more fuel. You want additionally " + additionalFuel + " units");
        } else {
            System.out.println("\n\tWelcome on " + planet.getName());
        }
    }
}