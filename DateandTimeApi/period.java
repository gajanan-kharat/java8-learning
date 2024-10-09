package DateandTimeApi;

import java.time.LocalDate;
import java.time.Period;

public class period {
    public static void main(String[] args) {
        LocalDate  now=LocalDate.now();
        LocalDate then=now.plusDays(1200);
        Period days=Period.between(now,then);
        System.out.println(days);
    }
}
