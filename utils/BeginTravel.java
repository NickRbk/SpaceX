package utils;

import destinations.EPlanet;
import rocket.Rocket;
import spaceCalculations.SpaceCalculations;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BeginTravel {
    public static boolean test(EPlanet planet, Rocket spaceX) {
        if( spaceX.isPotentiallyFlyable(planet.getDistanceMeters(), spaceX.getAccelerationAverage(),
                spaceX.getTotalWeight(), spaceX.getEfficiencyAverage(),spaceX.getTotalFuel()) ) {

            spaceX.getCabin();
            spaceX.getEngines();
            spaceX.getFuelTanks();

            spaceX.start();
            getTravelDuration(planet, spaceX.getAccelerationAverage());

            System.out.println("\nCongratulations! Try again? - y or [any key to abort]");
            return tryAgain();
        } else {
            System.out.println("\nOoops.. Maybe you`ll be more lucky next time. Try again? - y or [any key to abort]");
            return tryAgain();
        }
    }

    private static void getTravelDuration(EPlanet planet, float acceleration) {
        int daysInFlight = Integer.parseInt(SpaceCalculations.observerTravelTime(planet.getDistanceMeters(),
                acceleration).divide(BigDecimal.valueOf(3600), 0, RoundingMode.HALF_UP).toString());

        System.out.println("\nWelcome on " + planet.getName() + ". It far from Earth in " +
                planet.getDistanceLightYears() + " astronomical units and takes " + daysInFlight + " hours");

        System.out.println(String.format("\n\t\tEarth %s <------------ %s AU ------------> %s %s",
                Dates.currentDate().toString(), planet.getDistanceLightYears(),
                Dates.arrivalDate(daysInFlight), planet.getName()));
    }

    private static boolean tryAgain() {
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();

        return userInput.equals("y");
    }
}
