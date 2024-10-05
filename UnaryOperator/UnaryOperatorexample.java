package UnaryOperator;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
public class UnaryOperatorexample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "charlie");
        UnaryOperator<String> toUpperCase = String::toUpperCase;
        List<String> upperCaseNames = names.stream()
                .map(toUpperCase)
                .toList();
        System.out.println("Original Names: " + names);
        // Output: [alice, bob, charlie]
        System.out.println("Uppercase Names: " + upperCaseNames);
        // Output: [ALICE, BOB, CHARLIE]
    }
}

