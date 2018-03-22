package rocket;

import destinations.Planets;

public interface IFlyable {

    // define method same to all space rocket
    // calc is you can access your destination
    default void isSuccessFly(Planets planet, int tankVolume, int fuelConsumption) {
        int fuelNeeds = fuelConsumption * planet.getDestination();

        if(fuelNeeds > tankVolume) {
            int additionalFuel = fuelNeeds - tankVolume;
            System.out.println("\nOooops, your rocket crashed... You needed additionally " + additionalFuel + " fuel units");
        } else {
            System.out.println("\n\tWelcome on " + planet.getName());
        }
    }
}