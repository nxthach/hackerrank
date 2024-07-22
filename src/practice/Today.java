package practice;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

public class Today {
    public static void main(String[] args) {


        ZonedDateTime utcNow = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("Current date and time in UTC: " + utcNow);

        OffsetDateTime offsetDateTime = OffsetDateTime.now(ZoneOffset.ofHours(7));
        System.out.println("Current date and time in UTC: " + offsetDateTime);

        //Asia/Ho_Chi_Minh

        ZonedDateTime hcm = ZonedDateTime.now(ZoneId.of("Asia/Ho_Chi_Minh"));
        System.out.println("Current date and time in UTC: " + hcm);
    }
}
