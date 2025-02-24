package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    // List타입으로 받으면 유연성 증가(나중에 자료구조를 바꿀때도 사용하는 부분 변경 필요X)
    // 배열을 사용하지 않았기 때문에 입력 가능한 크기를 미리 정할 필요 없음
    // 그리고 요소가 몇개인지 나타내는 변수를 제거할 수 있음
    private List<Item> items = new ArrayList<>();
    private int totalPrice = 0;

    public void addItem(Item item){
        items.add(item);
        totalPrice += item.getTotalPrice();
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for (Item item : items) {
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + totalPrice);
    }
}
