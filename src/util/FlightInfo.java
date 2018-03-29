package src.util;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class FlightInfo {
    public static LocalDate departureDate() {
        return LocalDate.now();
    }

    public static LocalDate arrivalDate(int days) {
        return departureDate().plusDays(days);
    }
}
