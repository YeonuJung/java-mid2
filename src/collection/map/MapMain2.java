package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학성 성적 데이터 추가
        studentMap.put("student1", 100);
        System.out.println(studentMap);

        // 같은 키에 저장시 기존 값 교체
        studentMap.put("student1", 90);
        System.out.println(studentMap);

        // 특정 키를 포함하고 있는지
        boolean containsKey = studentMap.containsKey("student1");
        System.out.println("containsKey = " + containsKey);

        // 특정 학생의 값 삭제
        studentMap.remove("student1");
        System.out.println(studentMap);
    }
}
