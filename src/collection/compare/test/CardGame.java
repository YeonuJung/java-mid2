package collection.compare.test;

import java.util.ArrayList;

public class CardGame {
    private final ArrayList<Player> players = new ArrayList<>();
    private final Deck deck = new Deck();
    private Player winner;

    public void addPlayer(Player player){
        players.add(player);
    }

    public void shuffle(){
        deck.shuffle();
    }

    public Deck getDeck(){
        return deck;
    }

    public void showResult(){
        for (Player player : players) {
            player.showCards();
        }
        pickWinner();
        if(players.contains(winner)){
            System.out.println();
            System.out.println(winner.getName() + " 승리");
        }else{
            System.out.println("무승부");
        }
    }

    private void pickWinner(){
        if(players.getFirst().getTotalSum() < players.getLast().getTotalSum()){
            this.winner = players.getLast();
        }else if(players.getFirst().getTotalSum() == players.getLast().getTotalSum()){
            this.winner = new Player("무승부");
        }else{
            this.winner = players.getFirst();
        }
    }
}
