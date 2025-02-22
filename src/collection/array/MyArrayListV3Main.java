package collection.array;

public class MyArrayListV3Main {

    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        // 마지막에 추가 O(1)
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        // 원하는 위치에 추가 O(n), 마지막 추가만 O(1)
        System.out.println("addLast");
        list.add(3, "addLast"); // O(1)
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0, "addFirst"); // O(n)
        System.out.println(list);

        // 원하는 위치 제거 O(n), 마지막 제거만 O(1)
        System.out.println("removeLast");
        list.remove(4); // 마지막 삭제 -> O(1)
        System.out.println(list);

        System.out.println("removeFirst");
        list.remove(0); // 첫번째 삭제 -> O(n)
        System.out.println(list);
    }
}
