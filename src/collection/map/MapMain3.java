package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학성 성적 데이터 추가
        studentMap.put("student1", 50);
        System.out.println(studentMap);

        // 학생이 없는 경우에만 추가1 (학생이 있는 경우 덮어 씌워지니깐)
        if(!studentMap.containsKey("student1")){
            studentMap.put("student1", 100);
        }
        System.out.println(studentMap);

        // 학생이 없는 경우에만 추가2
        studentMap.putIfAbsent("student1", 100);
        studentMap.putIfAbsent("student2", 100);
        System.out.println(studentMap);

    }
}
