import destinations.Planets;
import engine.type.Engines;
import rocket.Rocket;
import rocket.SpaceX;
import rocket.cabin.type.Cabins;

import java.util.Scanner;

public final class Start {
    public static void bootstrap() {

        String cabin, destination;
        String[] engines, fuelTanks;

        cabin = askCabin();
        engines = askEngines();


        System.out.println(cabin);
        for(String engine : engines) {
            System.out.println(engine);
        }

        Planets planet = getDestination("Mars");

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

    private static String askCabin() {
        Scanner in = new Scanner(System.in);

        System.out.println("Hi, passenger! We have several cabins for you: \tcomfort | VIP | delux | cosy | economy");

        while(true) {
            String userInput = in.nextLine();

            for(Cabins cabin : Cabins.values()) {
                if(cabin.getName().equals(userInput)) {
                    return cabin.getName();
                }
            }
            System.out.println("ERR -> Sorry, you need to choose from list... Enter valid name");
        }
    }

    private static String[] askEngines() {
        Scanner in = new Scanner(System.in);

        int counter = 0;
        String[] engines = new String[5];

        System.out.println("Now select engines to your Rocket: \tslow | economy | superFast | fast | old");

        while(counter < 3) {

            String userInput = in.nextLine();

            int shadowCounter = counter;

            for(Engines engine : Engines.values()) {
                if(engine.getName().equals(userInput)) {
                    engines[counter] = engine.getName();
                    counter++;

                    if(counter < 3) {
                        System.out.println("Select one more engine: " + "(" + counter + " | 3)");
                    }
                }
            }

            if(shadowCounter == counter) {
                System.out.println("ERR -> Sorry, you need to choose from list... Enter valid name");
            }
        }

        boolean additionalEngine = false;

        do {
            if(counter == 5) break;
            System.out.println("Would you like more engine? - y or [any key to abort]");
            String answer = in.nextLine();

            if(answer.equals("y") && counter < 5) {
                additionalEngine = true;
                System.out.println("Select one more engine: " + "(" + counter + " | " + (counter + 1) + ")");
                String userInput = in.nextLine();

                int shadowCounter = counter;

                for(Engines engine : Engines.values()) {
                    if(engine.getName().equals(userInput)) {
                        engines[counter] = engine.getName();
                        ++counter;
                    }
                }

                if(shadowCounter == counter) {
                    System.out.println("ERR -> Sorry, you need to choose from list... Enter valid name");
                }


            } else {
                System.out.println("\n");
                additionalEngine = false;
            }

        } while(additionalEngine);

        return engines;
    }
}
