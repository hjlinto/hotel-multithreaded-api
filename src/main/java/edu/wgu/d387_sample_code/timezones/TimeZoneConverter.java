package edu.wgu.d387_sample_code.timezones;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

@CrossOrigin(origins = "http://localhost:4200")
public class TimeZoneConverter {

    public static String convertTimeZones() {

        // Specifies output to HH:mm format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        // Gives current time in UTC
        ZonedDateTime utc = ZonedDateTime.now(TimeZone.getTimeZone("UTC").toZoneId());

        // Gives current time in EST
        ZonedDateTime est = ZonedDateTime.now(TimeZone.getTimeZone("America/New_York").toZoneId());

        // Gives current time in MST
        ZonedDateTime mst = ZonedDateTime.now(TimeZone.getTimeZone("America/Denver").toZoneId());

        String utcTimeString = utc.format(formatter) + " UTC";
        String estTimeString = est.format(formatter) + " EST";
        String mstTimeString = mst.format(formatter) + " MST";

        return String.format("UTC: %s, ET: %s, MST: %s", utcTimeString, estTimeString, mstTimeString);
    }
}
