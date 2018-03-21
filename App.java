import enums.Planets;

public class App {
    public static void main(String ... args) {

        int tankVolume = Integer.parseInt( args[0] );
        int rocketCapacity = Integer.parseInt( args[1] );
        String destination = args[2]; // You can choose between Moon or Mars


        Rocket spaceX = new SpaceX(tankVolume);   // Create our best Rocket

        Rocket.Cabin cabin = spaceX.new Cabin();  // NOTE: rocket maintain only from cabin
                                                  //       Enter to cabin first !)

        cabin.start( rocketCapacity ); // NOTE: if you miss this line your rocket can't start
                                       //       Start rocket with engine specific capacity


        int fuelConsumption = spaceX.engine.getFuelConsumption(); // get fuel consumption

        if(destination.equals("Mars")) {

            isSuccessFly(Planets.MARS, tankVolume, fuelConsumption);

        } else if(destination.equals("Moon")) {

            isSuccessFly(Planets.MOON, tankVolume, fuelConsumption);

        } else {
            System.out.println("So far we're not fly to other planet... Choose Mars or Moon !)");
        }


    }

    // define method to calc is you can access your destination
    private static void isSuccessFly(Planets planet, int tankVolume, int fuelConsumption) {
        int fuelNeeds = fuelConsumption * planet.getDestination();

        if(fuelNeeds > tankVolume) {
            int additionalFuel = fuelNeeds - tankVolume;
            System.out.println("\nSorry but you need more fuel. You want additionally " + additionalFuel + " units");
        } else {
            System.out.println("\n\tWelcome on " + planet.getName());
        }
    }
}