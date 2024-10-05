package Methodreferences;

import java.util.Arrays;
import java.util.List;

public class StaticMethodReferenceExample {
    public static void printUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "charlie");
        names.forEach(StaticMethodReferenceExample::printUpperCase); // Refers to the static method
    }
}

