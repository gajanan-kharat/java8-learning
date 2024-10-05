package Methodreferences;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodReferenceExample {
    public void printLowerCase(String str) {
        System.out.println(str.toLowerCase());
    }

    public static void main(String[] args) {
        InstanceMethodReferenceExample instance = new InstanceMethodReferenceExample();
        List<String> names = Arrays.asList("ALICE", "BOB", "CHARLIE");
        names.forEach(instance::printLowerCase);
    }
}

