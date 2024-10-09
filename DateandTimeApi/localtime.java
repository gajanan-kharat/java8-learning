package DateandTimeApi;

import java.time.LocalTime;

public class localtime {
    public static void main(String[] args) {
        LocalTime time=LocalTime.now();
        System.out.println(time);
       LocalTime onehourbefore=time.minusHours(1);
        System.out.println(onehourbefore);
    }
}
