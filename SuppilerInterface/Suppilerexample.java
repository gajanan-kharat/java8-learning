package SuppilerInterface;

import java.util.Random;
import java.util.function.Supplier;
//Wap to print random number;

public class Suppilerexample {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Integer> randomNumberSupplier = () -> random.nextInt(100) + 1;
        for (int i = 0; i < 5; i++) {
            System.out.println("Random Number: " + randomNumberSupplier.get());
        }
    }
}
