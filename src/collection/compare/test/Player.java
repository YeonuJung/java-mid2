package collection.compare.test;

import java.util.ArrayList;

public class Player {
    private final ArrayList<Card> cards = new ArrayList<>();
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public void pick(Deck deck){
        initCards(deck);
        cards.sort(null);
    }

    private void initCards(Deck deck) {
        for(int i = 0; i < 5; i++){
            Card card = deck.pick();
            cards.add(card);
        }
    }

    public String getName(){
        return name;
    }

    public void showCards(){
        System.out.print(name + " 의 카드: ");
        System.out.print("[");
        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            System.out.print(card.getNumber() + "(" + card.getShape() + ")");

            if (i != cards.size() - 1) {  // 마지막 카드가 아니면 ", " 출력
                System.out.print(", ");
            }
        }
        System.out.print("], 합계: " + getTotalSum());
        System.out.println();
    }

    public int getTotalSum(){
        int totalSum = 0;
        for (Card card : cards) {
            totalSum += card.getNumber();
        }
        return totalSum;
    }

}
