package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);
        System.out.println(studentMap);

        // 특정 학생의 값 조회
        Integer result = studentMap.get("studentA");
        System.out.println("result = " + result);

        // 키 목록 조회(중복 아니기에 Set으로 반환)
        System.out.println("KeySet 활용");
        Set<String> keySet = studentMap.keySet();
        for (String key : keySet) {
            Integer value = studentMap.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }

        // 값 목록 조회(중복 허용, 순서 보장 안하기에 리스트가 아닌 상위 타입인 컬렉션으로 반환)
        System.out.println("values 활용");
        Collection<Integer> values = studentMap.values();
        System.out.println("values = " + values);

        // 키와 값 목록 조회 (엔트리는 키와 값의 쌍으로 이루어진 객체)
        // entry = key & value 쌍을 의미(항목)
        // 키가 중복될 수 없기 때문에 이 또한 Set으로 반환
        System.out.println("entrySet 활용");
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " +  key + ", value = " + value);
        }
    }
}
