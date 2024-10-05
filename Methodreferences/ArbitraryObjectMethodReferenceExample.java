package Methodreferences;

import java.util.Arrays;
import java.util.List;

public class ArbitraryObjectMethodReferenceExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");

         words.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}



