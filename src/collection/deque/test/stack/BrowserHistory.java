package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    Deque<String> history = new ArrayDeque<>();

    public void visitPage(String page){
        history.push(page);
        System.out.println("방문: " + page);
    }

    public String goBack(){
        if(!history.isEmpty()){
            history.pop();
            System.out.println("뒤로 가기: " + history.peek());
            return history.peek();
        }
        return null;
    }

}
