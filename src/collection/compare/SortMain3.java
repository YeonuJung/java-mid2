package collection.compare;

import java.util.Arrays;

public class SortMain3 {
    // Arrays.sort() 는 비교자를 넘기지 않으면 기본적으로 오름차순 정렬을 함
    // 객체의 정렬을 위해서는 반드시 Comparable 인터페이스를 구현하거나,
    // Comparator(비교자)를 만들어서 sort() 메서드에 전달해주어야 함

    // 기본 객체들은 대부분 Comparable이 구현되어있다.
    // 비교자 인터페이스는 디폴트 메서드인 reversed() 메서드 제공(디폴트 메서드는 인터페이스에서도 상속처럼 기능 제공)

    // 이와 같은 정렬은 순서가 있는 자료구조에서만 사용할 수 있음
    // 순서가 없는데 정렬을 한다? 말도 안되는 소리임
    public static void main(String[] args) {
    MyUser myUser1 = new MyUser("a", 30);
    MyUser myUser2 = new MyUser("b", 20);
    MyUser myUser3 = new MyUser("c", 10);

    MyUser[] users = {myUser1, myUser2, myUser3};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(users));

        System.out.println("Comparable 기본 정렬");
        Arrays.sort(users);
        System.out.println(Arrays.toString(users));

        // 추가
        System.out.println("IdComparator 정렬");
        Arrays.sort(users, new IdComparator());
        System.out.println(Arrays.toString(users));
        System.out.println("reversed");
        Arrays.sort(users, new IdComparator().reversed());
        System.out.println(Arrays.toString(users));
    }
}
