package collection.list;

public class MyListPerformanceTest {

    public static void main(String[] args) {
        int size = 50_000;

        // 찾는건 빠른데 데이터를 밀어야 하니깐 앞쪽으로 갈수록 불리
        System.out.println("==MyArrayList 추가==");
        addFirst(new MyArrayList<>(), size); // 찾는데 O(1), 데이터 추가(밀기)-O(n)
        addMid(new MyArrayList<>(), size); // 찾는데 O(1), 데이터 추가(밀기)-O(n)
        MyArrayList<Integer> arrayList = new MyArrayList<>(); // 조회용 데이터로 사용
        addLast(arrayList, size); // 찾는데 O(1), 맨뒤라 데이터 밀 필요 없음-O(1)

        int loop = 10_000;
        System.out.println("==MyArrayList 조회==");
        getIndex(arrayList, loop, 0); // 앞에서 조회 - O(1)
        getIndex(arrayList, loop, size / 2); // 평균 조회 - O(1)
        getIndex(arrayList, loop, size - 1); // 끝에서 조회 - O(1)

        System.out.println("==MyArrayList 검색==");
        search(arrayList, loop, 0); // 앞에서 검색 - O(1)
        search(arrayList, loop, size / 2); // 평균 검색 - O(n)
        search(arrayList, loop, size - 1); // 끝에서 검색 - O(n)


        // 찾는게 느리기 때문에 뒷쪽으로 갈수록 불리
        System.out.println("==MyLinkedList 추가==");
        addFirst(new MyLinkedList<>(), size); // 맨 앞이라 바로 찾음-O(1), 데이터 추가(밀기)-O(1)
        addMid(new MyLinkedList<>(), size); // 찾는데 O(n), 데이터 추가(밀기)-O(1)
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(); // 조회용 데이터로 사용
        addLast(linkedList, size); // 찾는데 O(n), 데이터 추가(밀기)-O(1)

        System.out.println("==MyLinkedList 조회==");
        getIndex(linkedList, loop, 0); // 앞에서 조회 - O(1)
        getIndex(linkedList, loop, size / 2); // 평균 조회 - O(n)
        getIndex(linkedList, loop, size - 1); // 끝에서 조회 - O(n)

        System.out.println("==MyLinkedList 검색==");
        search(linkedList, loop, 0); // 앞에서 검색 - O(1)
        search(linkedList, loop, size / 2); // 평균 검색 - O(n)
        search(linkedList, loop, size - 1); // 끝에서 검색 - O(n)

    }

    private static void addFirst(MyList<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addMid(MyList<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addLast(MyList<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void search(MyList<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }
}
