package DateandTimeApi;

import java.time.LocalDate;

public class localdate {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        LocalDate customdate=LocalDate.of(2001,8,29);
        System.out.println( today);
        System.out.println(customdate);
        LocalDate yesterday=today.minusDays(1);
        System.out.println(yesterday);
        if(today.isAfter(yesterday)){
            System.out.println("yes bro");
        }

//        int date=customdate.getDayOfMonth();
//        int month= customdate.getMonthValue();
//        int year= customdate.getYear();
//
//        System.out.println(date);
//        System.out.println(month);
//        System.out.println(year);
    }
}
