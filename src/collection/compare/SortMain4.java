package collection.compare;

import java.util.LinkedList;
import java.util.List;

public class SortMain4 {
    // 정렬은 리스트에서도 가능(순서만 있으면 가능)
    // 순서만 있다면 어차피 비교는 각 객체가 Comparable 한지에 따라 결정되기 때문에
    public static void main(String[] args) {
    MyUser myUser1 = new MyUser("a", 30);
    MyUser myUser2 = new MyUser("b", 20);
    MyUser myUser3 = new MyUser("c", 10);

        List<MyUser> list = new LinkedList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);
        System.out.println("list = " + list);

        System.out.println("Comparable 기본 정렬");
        list.sort(null);
        // 또는 Collections.sort(list) 로도 가능
        System.out.println(list);
        System.out.println("IdComparator 정렬");
        // Coleections.sort(list, new IdComparator())
        list.sort(new IdComparator());
        System.out.println(list);
        // 다만 객체지향 관점에서 리스트라는 객체가 모든 데이터를 가지고 있기 때문에
        // 이 객체에서 내부를 정렬하는 것이 더 바람직함
        // 그렇기 때문에 리스트에서 sort()메서드를 사용하는 것 권장
    }
}
