package collection.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class UniqueNamesTest1 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        HashSet<Integer> set = new HashSet<>(Arrays.asList(inputArr));
        Iterator<Integer> iterator = set.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
