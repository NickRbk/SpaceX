import destinations.Planets;
import rocket.Rocket;
import rocket.SpaceX;

public final class Start {
    public static void bootstrap(int tankVolume, int rocketCapacity, String destination) {
        Planets planet = getDestination(destination);

        if(planet != null) {
            Rocket spaceX = new SpaceX(tankVolume);   // Prepare rocket to fly

            Rocket.Cabin cabin = spaceX.new Cabin();  // NOTE: rocket maintain only from cabin
                                                      //       Enter to cabin first !)

            cabin.start( rocketCapacity ); // NOTE: if you miss this line your rocket can't start
                                           //       Start rocket with engine specific capacity

            spaceX.isSuccessFly(planet, tankVolume, spaceX.engine.getFuelConsumption() );
        } else {
            System.out.println("So far we're not fly to other planet... Choose Mars or Moon !)");
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
