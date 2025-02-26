package collection.set;

import java.util.Arrays;

public class HashStart3 {

    public static void main(String[] args) {
        Integer[] inputArray = new Integer[100];
        // 입력: 1, 2, 5, 8, 14, 99
        // [null, 1, 2, null, null, 5, null, null, 8, ..., 14, ..., 99]
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 99;
        // 데이터 검색 O(1) (데이터의 값 자체를 인덱스로 사용했기 때문에)
        // 하지만 배열의 낭비되는 공간이 많이 발생함
        Integer result = inputArray[searchValue];
        System.out.println("searchValue = " + result);
    }
}


