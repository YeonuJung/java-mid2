package collection.link;


public class MyLinkedListV3Main {

    public static void main(String[] args) {
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();
        
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String string = stringList.get(0);
        System.out.println("string = " + string);

        MyLinkedListV3<Integer> intergerList = new MyLinkedListV3<>();
        intergerList.add(1);
        intergerList.add(2);
        intergerList.add(3);
        Integer integer = intergerList.get(0);
        System.out.println("integer = " + integer);
    }
}
