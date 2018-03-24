import destinations.Planets;
import rocket.Rocket;
import rocket.SpaceX;

public final class Start {
    public static void bootstrap(String cabin, String engine, String fuelTank, String destination) {
        Planets planet = getDestination(destination);

        if(planet != null) {

            SpaceX spaceX = new SpaceX();

            System.out.println("TIME = " + spaceX.getTimeTrip());
            System.out.println("VELOCITY = " + spaceX.getMaximumVelocity());
            System.out.println("Fuel NEEDS = " + spaceX.getFuelNeeds());


        } else {
            System.out.println("So far we're not fly to other systems... Choose planets within Solar system !)");
        }
    }

    private static Planets getDestination(String destination) {
        for(Planets planet : Planets.values()) {
            if(destination.equals( planet.getName() )) {
               return planet;
            }
        }
        return null;  // if passenger choose invalid destination return null
    }
}
