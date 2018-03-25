package utils;

import destinations.Planets;
import rocket.Rocket;
import spaceCalculations.SpaceCalculations;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BeginTravel {
    public static boolean test(Planets planet, Rocket spaceX) {
        if( spaceX.isPotentiallyFlyable(planet.getDistanceMeters(), spaceX.getAccelerationAverage(), spaceX.getTotalWeight(),
                spaceX.getEfficiencyAverage(),spaceX.getTotalFuel()) ) {

            spaceX.getCabin();
            spaceX.getEngines();
            spaceX.getFuelTanks();

            spaceX.start();


            int daysInFlight = Integer.parseInt(SpaceCalculations.observerTravelTime(planet.getDistanceMeters(), spaceX.getAccelerationAverage())
                    .divide(BigDecimal.valueOf(86400), 0, RoundingMode.HALF_UP).toString());

            System.out.println("\nWelcome on " + planet.getName() + ". It far from Earth in " + planet.getDistanceLightYears() +
                    " light-years and takes " + daysInFlight + " days");

            System.out.println(String.format("\n\t\tEarth %s ------------------------------> %s %s", Dates.currentDate().toString(), planet.getName(), Dates.arrivalDate(daysInFlight)));


            System.out.println("\nCongratulations! Try again? - y or [any key to abort]");
            return tryAgain();
        } else {
            System.out.println("\nOoops.. Maybe you`ll be more lucky next time. Try again? - y or [any key to abort]");
            return tryAgain();
        }
    }

    private static boolean tryAgain() {
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();

        if(userInput.equals("y")) {
            return true;
        }
        return false;
    }
}
