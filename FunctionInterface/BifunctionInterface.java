package FunctionInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
public class BifunctionInterface {
    public static void main(String[] args) {
        // Two lists of integers
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        // BiFunction to merge two lists
        BiFunction<List<Integer>, List<Integer>, List<Integer>> mergeLists = (l1, l2) -> {
            List<Integer> mergedList = new ArrayList<>(l1);
            mergedList.addAll(l2);
            return mergedList;
        };
        // Apply the BiFunction to merge the lists
        List<Integer> resultList = mergeLists.apply(list1, list2);
        // Print the merged list
        System.out.println(resultList);  // Output: [1, 2, 3, 4, 5, 6]
    }
}


