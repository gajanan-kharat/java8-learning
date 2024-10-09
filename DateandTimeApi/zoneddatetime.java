package DateandTimeApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class zoneddatetime {
    public static void main(String[] args) {
        ZonedDateTime today=ZonedDateTime.now();
        System.out.println(today);
        ZonedDateTime newyork=ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(newyork);
//        Set<String> availableid=ZoneId.getAvailableZoneIds();
//        availableid.stream().filter(e->e.startsWith("Asia/C")).forEach(System.out::println);

    }
}
