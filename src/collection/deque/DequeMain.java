package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {
    // 덱의 대표적인 구현체는 ArrayDeque와 LinkedList가 있다.
    // ArrayDeque가 모든 면에서 더 빠르다!
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // 데이터 추가
        deque.offerFirst(1); // 앞에서 [1]
        System.out.println(deque);
        deque.offerFirst(2); // 앞에서 [2, 1]
        System.out.println(deque);
        deque.offerLast(3); // 뒤에서 [2, 1, 3]
        System.out.println(deque);
        deque.offerLast(4); // 뒤에서 [2, 1, 3, 4]
        System.out.println(deque);

        // 다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekLast() = " + deque.peekLast());

        // 데이터 꺼내기
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println(deque);
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println(deque);
        System.out.println("deque.pollLast() = " + deque.pollLast());
        System.out.println(deque);
        System.out.println("deque.pollLast() = " + deque.pollLast());
        System.out.println(deque);
    }
}
