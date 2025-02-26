package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // 연결 리스트를 담을 수 있는 배열 생성
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        // 배열 내부의 연결 리스트를 초기화 해주지 않아서 아직 모든 값이 null인 상태
        System.out.println("buckets = " + Arrays.toString(buckets));

        for(int i = 0; i < CAPACITY; i++){
            buckets[i] = new LinkedList<>();
        }
        // 모두 연결 리스트로 초기화 된 상태
        System.out.println("buckets = " + Arrays.toString(buckets));
        // 입력: 1, 2, 5, 8, 14, 99
        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9); // 중복
        System.out.println("buckets = " + Arrays.toString(buckets));

        // 검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("bucket.contains(" + searchValue + ") = " + contains );

    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue){
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        return bucket.contains(searchValue); // O(n)
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        if(!bucket.contains(value)){ // O(n)
            bucket.add(value);
        }
    }

}


