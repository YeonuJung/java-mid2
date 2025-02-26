package collection.set;

import java.util.Arrays;

public class HashStart4 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        Integer[] inputArray = new Integer[CAPACITY];
        // 입력: 1, 2, 5, 8, 14, 99
        // [null, 1, 2, null, 14, 5, null, null, 8, 99]
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 99;
        // 데이터 검색 O(1) - 해쉬 인덱스를 통해 바로 접근하니깐
        // 해쉬 인덱스를 활용하여 낭비되는 공간 줄임(CAPACITY 만큼만 공간 생성)
        // 하지만 해시 충돌이 발생할 수 있음(값이 중복될 수 있음)
        Integer result = inputArray[hashIndex(searchValue)];
        System.out.println("searchValue = " + result);
    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }

    private static void add(Integer[] inputArray, int value) {
        inputArray[hashIndex(value)] = value;
    }
}


