package collection.compare.test;

public class CardGameMain {
    public static void main(String[] args) {
        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        // CardGame은 사실 추상적인 개념으로 클래스로 만들어서 인스턴스화 하는게 이상함
        // 다시 수정한다면 CardGame 클래스는 없애고 플레이어들과 덱의 조합으로
        // 문제 풀도록 고치면 더 좋은 객체지향적인 설계일 것 같음
        CardGame cardGame = new CardGame();

        cardGame.addPlayer(player1);
        cardGame.addPlayer(player2);

        cardGame.shuffle();

        player1.pick(cardGame.getDeck());
        player2.pick(cardGame.getDeck());

        cardGame.showResult();
    }
}
