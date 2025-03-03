package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private final ArrayList<Card> deck = new ArrayList<>();


    public Deck(){
        // 이렇게 정해진 값들은 ENUM 상수로 만드는게 더 좋다
        String[] shapes = {"♠", "♥", "♦", "♣" };
        initDeck(shapes);
    }

    private void initDeck(String[] shapes) {
        for(int i = 0; i < 13; i++){
            for (String shape : shapes) {
                Card card = new Card(shape, i + 1);
                deck.add(card);
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public Card pick(){
        int randomNumber = (int) (Math.random() * deck.size()) + 1;
        return deck.remove(randomNumber);
    }
}
