package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange, banana, apple, apple, banana, apple";

        Map<String, Integer> result = new HashMap<>();
        String[] fruits = text.split(", ");


        for (String fruit : fruits) {
            Integer count = result.get(fruit);
            if(count ==  null){
                count = 0;
            }
            count++;
            result.put(fruit, count);
        }

        System.out.println(result);
    }
}
