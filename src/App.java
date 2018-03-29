package src;

import src.destination.Planets;
import src.model.engine.Engine;
import src.model.fuelTank.FuelTank;
import src.model.rocket.impl.AbstractRocket;
import src.model.rocket.impl.SpaceX;
import src.util.BeginTravel;
import src.util.UserInteraction;

public class App {
    public static void main(String ... args) {
        bootstrap();
    }

    private static void bootstrap() {
        boolean tryAgain;
        do {
            // Ask user for essential parameters for our space travel
            String cabin = UserInteraction.askCabin();
            Engine[] engines = UserInteraction.askEngines();
            FuelTank[] fuelTanks = UserInteraction.askFuelTanks( engines );
            Planets planet = UserInteraction.askDestination();

            // Create AbstractRocket with input parameters
            AbstractRocket spaceX = new SpaceX();
            spaceX.assembleRocket(cabin, engines, fuelTanks);

            // Try to fly and ask for try again
            tryAgain = BeginTravel.test(planet, spaceX);
        } while(tryAgain);

        System.out.println("\n\t Bye!\n");
    }
}