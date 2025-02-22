package collection.array;

public class MyArrayListV4Main {
    // 제네릭을 사용해서 배열리스트의 타입 안정성이 올라감
    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String string = stringList.get(0);
        System.out.println("string = " + string);

        MyArrayListV4<Integer> integerList = new MyArrayListV4<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        Integer ineger = integerList.get(0);
        System.out.println("ineger = " + ineger);
    }
}
