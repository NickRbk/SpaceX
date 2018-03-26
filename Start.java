import destinations.EPlanet;
import engine.Engine;
import rocket.Rocket;
import rocket.SpaceX;
import rocket.fuelTank.FuelTank;
import utils.BeginTravel;
import utils.UserInteraction;

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
