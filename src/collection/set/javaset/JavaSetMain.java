package collection.set.javaset;

import java.util.*;

public class JavaSetMain {

    public static void main(String[] args) {
        run(new HashSet<>()); // 입력한 순서 보장 X (해시 인덱스를 기반으로 값을 넣기 때문에) - O(1)
        run(new LinkedHashSet<>()); // 입력한 순서대로 데이터 정렬 (연결 리스트를 추가로 사용하기 때문에) - O(1)
        run(new TreeSet<>()); // 데이터의 값을 기준으로 정렬 (트리구조를 활용하기 때문에) - O(log N)

        // HashSet을 가장 많이 사용하고, 입력 순서나 데이터 정렬이 필요할 때 나머지 구조를 사용하기
    }

    private static void run(Set<String> set){
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
