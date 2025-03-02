package collection.map.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ItemPriceTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        Iterator<String> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            String fruit = iterator.next();

            if(map.get(fruit) != 1000){
                iterator.remove();
            }
        }
        System.out.println(map.keySet());
    }
}
