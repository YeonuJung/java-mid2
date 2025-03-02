package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {
    // 덱은 스택, 큐로 활용할 수 있도록 동일한 이름의 메서드 제공
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // 데이터 추가
        deque.offer(10);
        deque.offer(20);
        deque.offer(30);
        System.out.println(deque);

        // 다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("deque.peek() = " + deque.peek());

        // 데이터 꺼내기
        deque.poll();
        System.out.println(deque);
        deque.poll();
        System.out.println(deque);

    }
}
