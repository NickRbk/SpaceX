package utils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Dates {
    public static LocalDate currentDate() {
        Date date = new Date();
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalDate arrivalDate(int days) {
        return currentDate().plusDays(days);
    }
}
