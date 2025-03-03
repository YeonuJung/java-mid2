package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {

    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});
        Iterator<Integer> iterator = myArray.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // 추가 (향상된 for문은 배열이거나, iterable 객체인 경우만 사용 가능)
        System.out.println("for-each 사용");
        for (Integer value : myArray) {
            System.out.println("value = " + value);
        }
        // -> 이 for문은 컴파일 시점에 아래와 같이 변함
        /* while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("value = " + value)
        }
         */
    }
}
