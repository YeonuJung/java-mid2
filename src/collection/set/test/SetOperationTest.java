package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationTest {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        set1.addAll(set2);
        System.out.println("합집합: " + set1);
        set1.removeAll(List.of(6, 7));
        set1.retainAll(set2);
        System.out.println("교집합: " + set1);
        set1.addAll(List.of(1, 2));
        set1.removeAll(set2);
        System.out.println("차집합: " + set1);


    }
}
