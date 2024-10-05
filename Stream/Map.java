package Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Indian INR to the USD

public class Map {
    public static void main(String[] args) {
        List<Double> pricesInRupees = Arrays.asList(1200.00, 800.00, 300.00, 150.00, 50.00);

        double conversionRate = 75.0; // 1 USD = 75 INR

        List<Double> pricesInDollars = pricesInRupees.stream()
                .map(price -> price / conversionRate)
                .collect(Collectors.toList());

        System.out.println("Prices in Rupees: " + pricesInRupees);
        System.out.println("Prices in Dollars: " + pricesInDollars);
    }
}



