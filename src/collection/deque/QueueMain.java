package collection.deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueMain {
    // LinkedList는 List뿐만 아니라 데크(큐의 구현체)도 구현
    public static void main(String[] args) {
        // LinkedList보다 ArrayDeque가 훨씬 빠르다
        Queue<Integer> queue = new ArrayDeque<>();
        // Queue<Integer> queue = new LinkedList<>();
        // 데이터 추가
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);
        System.out.println();

        // 다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println();

        // 데이터 꺼내기
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println(queue);
    }
}
