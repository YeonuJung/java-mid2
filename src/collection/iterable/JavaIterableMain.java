package collection.iterable;

import java.util.*;

public class JavaIterableMain {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        printAll(list.iterator());
        forEach(list);
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        printAll(set.iterator());
        forEach(set);
    }

    private static void printAll(Iterator<Integer> iterator){
        System.out.println("iterator.getClass() = " + iterator.getClass());
        while(iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println("next = " + next);
        }
    }

    private static void forEach(Iterable<Integer> iterable){
        System.out.println("iterable.getClass() = " + iterable.getClass());
        for (Integer  value: iterable) {
            System.out.println("value = " + value);
        }
    }
}
