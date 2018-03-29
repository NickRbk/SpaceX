package src.util;

import java.time.LocalDate;

public class FlightInfo {
    public static LocalDate departureDate() {
        return LocalDate.now();
    }

    public static LocalDate arrivalDate(int days) {
        return departureDate().plusDays(days);
    }
}
