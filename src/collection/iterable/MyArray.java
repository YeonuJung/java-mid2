package collection.iterable;

import java.util.Iterator;

// Iterable을 구현하면 이제 순회할 수 있다고 명시하는 것
// Iterable을 구현하려면 iterator 메서드(반복자)를 오버라이딩 하게 되어있음
// 그럼 iterator 메서드를 사용할 수 있고, 이 반복자를 통해 순회 가능
public class MyArray implements Iterable<Integer>{

    private int[] numbers;

    public MyArray(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);
    }
}
