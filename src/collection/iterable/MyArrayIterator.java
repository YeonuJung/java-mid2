package collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {
    // -1 이어야 next()를 했을 때 배열의 첫번째 인덱스인 0을 기준으로 값을 반환하니깐
    private int currentIndex = -1;
    private int[] targetArr;


    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < targetArr.length - 1;
    }

    @Override
    public Integer next() {
        return targetArr[++currentIndex];
    }
}
