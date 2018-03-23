package rocket;

import destinations.Planets;
import engine.Engine;

public interface IFlyable {

    // define method same to all space rocket
    // calc is you can access your destination
    default void isSuccessFly(Planets planet, int tankVolume, int fuelConsumption) {
        if(Engine.getFuelNeeds(fuelConsumption, planet.getDestination()) > tankVolume) {
            System.out.println("\nOooops, your rocket crashed... You needed additionally "
                    + Engine.getAdditionalFuelNeeds(fuelConsumption, planet.getDestination(), tankVolume)
                    + " fuel units");
        } else {
            System.out.println("\n\tWelcome on " + planet.getName());
        }
    }
}