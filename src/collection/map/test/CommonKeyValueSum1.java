package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonKeyValueSum1 {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        Map<String, Integer> result = new HashMap<>();

        Set<String> map1Keys = map1.keySet();
        Set<String> map2Keys = map2.keySet();
        map1Keys.retainAll(map2Keys);

        for (String commonKey : map1Keys) {
           result.put(commonKey, map1.get(commonKey) + map2.get(commonKey));
        }

        System.out.println(result);
    }
}
