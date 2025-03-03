package collection.compare;

import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {
    MyUser myUser1 = new MyUser("a", 30);
    MyUser myUser2 = new MyUser("b", 20);
    MyUser myUser3 = new MyUser("c", 10);

        // Tree 구조는 데이터를 넣을 때 정렬이 필요하기 때문에
        // 반드시 해당 객체에서 Comparable를 구현해야 함
        // 아니면 Comparator를 별도로 구현해야 함
        // 트리는 입력과 동시에 정렬이 되기 때문에 따로 메서드에 비교자를 전달할 수 없기 때문에
        // 생성자에 비교자를 전달하여 원하는 방식으로 정렬할 수 있다
        TreeSet<MyUser> users = new TreeSet<>();
        users.add(myUser1);
        users.add(myUser2);
        users.add(myUser3);

        // 들어가는 순간에 이미 정렬이 되어 있음
        System.out.println("Comparable 기본 정렬");
        System.out.println(users);

        // 생성자에 비교자 전달
        TreeSet<MyUser> users2 = new TreeSet<MyUser>(new IdComparator());
        users2.add(myUser1);
        users2.add(myUser2);
        users2.add(myUser3);
        System.out.println(users2);
    }
}
