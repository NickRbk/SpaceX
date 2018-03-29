package src;

import src.destination.EPlanet;
import src.engine.Engine;
import src.rocket.Rocket;
import src.rocket.SpaceX;
import src.rocket.fuelTank.FuelTank;
import src.utils.BeginTravel;
import src.utils.UserInteraction;

public final class Start {
    public static void bootstrap() {
        boolean tryAgain;
        do {
            // Ask user for essential parameters for our space travel
            String cabin = UserInteraction.askCabin();
            Engine[] engines = UserInteraction.askEngines();
            FuelTank[] fuelTanks = UserInteraction.askFuelTanks( engines );
            EPlanet planet = UserInteraction.askDestination();

            // Create Rocket with input parameters
            Rocket spaceX = new SpaceX();
            spaceX.assembleRocket(cabin, engines, fuelTanks);

            // Try to fly and ask for try again
            tryAgain = BeginTravel.test(planet, spaceX);
        } while(tryAgain);

        System.out.println("\n\t Bye!\n");
    }
}
