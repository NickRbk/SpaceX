package src.util;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class FlightInfo {
    public static LocalDate departureDate() {
        Date date = new Date();
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalDate arrivalDate(int days) {
        return departureDate().plusDays(days);
    }
}
