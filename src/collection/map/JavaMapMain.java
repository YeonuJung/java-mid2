package collection.map;

import java.util.*;

public class JavaMapMain {

    public static void main(String[] args) {
        // Map은 Set이랑 똑같지만 들어가는 자료가 Key : value 형태인 것 뿐
        // 마찬가지로 해시인덱스를 사용하는 맵이면 키값이 해시인덱스를 사용한다는 것
        // 링크드 해시 맵은 키의 입력한 순서를 보장
        // 트리 맵은 키 자체의 데이터 값을 기준으로 정렬을 보장
        run(new HashMap<>()); // O(1)
        run(new LinkedHashMap<>()); // O(1 )
        run(new TreeMap<>()); // O(log N)

        // 단, value를 찾는 것은 O(n)으로 전부 다 뒤져야 함 (선형 탐색)
    }

    private static void run(Map<String, Integer> map){
        System.out.println("map = " + map.getClass());
        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);
        map.put("1", 40);
        map.put("2", 50);

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println("key = " + key + ", value = " + map.get(key));
        }
    }
}
