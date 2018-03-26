package utils;

import destinations.EPlanet;
import engine.Engine;
import engine.type.EEngine;
import rocket.cabin.type.ECabin;
import rocket.fuelTank.FuelTank;
import rocket.fuelTank.type.EFuelTank;

import java.util.Arrays;
import java.util.Scanner;

public class UserInteraction {
    public static String askCabin() {
        Scanner in = new Scanner(System.in);

        System.out.println("Step 1. Hi, passenger! We have several cabins for you: \tcomfort | VIP | delux | cosy | economy");

        while(true) {
            String userInput = in.nextLine();

            for(ECabin cabin : ECabin.values()) {
                if(cabin.getName().equals(userInput)) {
                    return cabin.getName();
                }
            }
            System.out.println("ERR -> Sorry, you need to choose from list... Enter valid name");
        }
    }

    public static Engine[] askEngines() {
        Scanner in = new Scanner(System.in);

        int counter = 0;
        String[] enginesType = new String[5];

        System.out.println("Step 2. Now select engines to your Rocket: \tslow | economy | superFast | fast | old");

        while(counter < 3) {

            String userInput = in.nextLine();

            int shadowCounter = counter;

            for(EEngine engine : EEngine.values()) {
                if(engine.getName().equals(userInput)) {
                    enginesType[counter] = engine.getName();
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

        boolean additionalEngine;

        do {
            if(counter == 5) break;
            System.out.println("Would you like more engine? - y or [any key to abort]");
            String answer = in.nextLine();

            if(answer.equals("y") && counter < 5) {
                additionalEngine = true;
                System.out.println("Select one more engine: " + "(" + counter + " | " + (counter + 1) + ")");
                String userInput = in.nextLine();

                int shadowCounter = counter;

                for(EEngine engine : EEngine.values()) {
                    if(engine.getName().equals(userInput)) {
                        enginesType[counter] = engine.getName();
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

        Engine[] engines = new Engine[ enginesType.length ];

        for(int i = 0; i < enginesType.length ; i++) {
            if(enginesType[i] != null) {
                engines[i] = new Engine( enginesType[i] );
            }
        }

        // remove null from array
        engines = Arrays.stream(engines)
                .filter(s -> (s != null))
                .toArray(Engine[]::new);

        return engines;
    }



    public static FuelTank[] askFuelTanks(Engine[] engines) {
        String fuelTanksType[] = new String[ engines.length ];
        int engineNumber = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Step 3. Now select fuel tanks to your engines: \tsmall | medium | large | huge | titanic");
        for(Engine engine : engines) {
            engineNumber++;

            if(engine != null) {
                boolean flag = true;

                System.out.println( String.format("Select fuel tanks to your engine#%d (%s)", engineNumber, engine.getName()) );

                while(flag) {
                    boolean isBigger = false;
                    String userInput = in.nextLine();

                    for(EFuelTank fuelTankType : EFuelTank.values()) {
                        if(userInput.equals(fuelTankType.getName())) {
                            if(fuelTankType.getHeight() > engine.getHeight()
                                    || fuelTankType.getWidth() > engine.getWidth()) {

                                isBigger = true;
                                System.out.println( String.format("ERR for engine#%d (%s)-> Sorry, your tank bigger than engine, choose another type: ",
                                        engineNumber, engine.getName()));
                            } else {
                                fuelTanksType[engineNumber - 1] = userInput;
                                flag = false;
                            }
                        }
                    }

                    if(fuelTanksType[engineNumber - 1] == null && !isBigger ) {
                        System.out.println("ERR -> Sorry, you need to choose from list... Enter valid name");
                    }
                }


            }
        }

        FuelTank[] fuelTanks = new FuelTank[ engines.length ];

        for(int i = 0; i < fuelTanksType.length ; i++) {
            if(fuelTanksType[i] != null) {
                fuelTanks[i] = new FuelTank( fuelTanksType[i] );
            }
        }

        // remove null from array
        fuelTanks = Arrays.stream(fuelTanks)
                .filter(s -> (s != null))
                .toArray(FuelTank[]::new);

        return fuelTanks;
    }

    public static EPlanet askDestination() {
        Scanner in = new Scanner(System.in);

        System.out.println("Step 4. Hi, passenger! We've almost finished, choose a planet to travel:" +
                " \n\tMars | Jupiter | Saturn | Uranus | Neptune");

        while(true) {
            String userInput = in.nextLine();

            for(EPlanet planet : EPlanet.values()) {
                if(userInput.equals( planet.getName() )) {
                    return planet;
                }
            }

            System.out.println("So far we're not fly to other systems... Choose planets within Solar system !)");
        }
    }
}
