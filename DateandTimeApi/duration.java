package DateandTimeApi;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class duration {
    public static void main(String[] args) {
        LocalDateTime today=LocalDateTime.now();

        LocalDateTime customdate=LocalDateTime.of(2019,8,29,2,24);

        Duration duration=Duration.between(today,customdate);
        System.out.println(duration);
    }
}
