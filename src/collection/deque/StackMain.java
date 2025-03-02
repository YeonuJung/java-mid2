package collection.deque;

import java.util.Stack;

public class StackMain {

    // 스택 클래스는 벡터를 상속받아 사용하는데, 아주 예전에 개발된 거라 사용권장 X
    // Deque 사용 권장(덱은 양방향 입출력이 가능한 큐로, 스택과 큐의 기능 모두 제공)
    // 덱에서 스택에 필요한 메서드 제공
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // 스택에 요소 넣기
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        // 다음 꺼낼 요소 확인(꺼내지 않고 단순 조회만)
        System.out.println("stack.peek() = " + stack.peek());

        // 스택 요소 뽑기
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

    }
}
