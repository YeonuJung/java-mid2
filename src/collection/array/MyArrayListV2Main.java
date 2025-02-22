package collection.array;

public class MyArrayListV2Main {

    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2();
        System.out.println("==데이터 추가==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("==범위 초과==");
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);

        // 범위 초과하면 grow() 메서드를 통해 capacity 2배 증가시키고 새로운 배열 생성해서
        // 기존의 참조값에 새로운 배열의 참조값으로 교체
        list.add("f");
        System.out.println(list);
    }
}
