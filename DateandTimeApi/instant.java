package DateandTimeApi;

import java.time.Instant;
import java.time.LocalDateTime;

public class instant {
    public static void main(String[] args) {
        LocalDateTime today=LocalDateTime.now();
        System.out.println(Instant.now());

//        Instant specificInstant = Instant.ofEpochSecond(1638469200);
//        System.out.println("Specific instant: " + specificInstant);


    }
}
