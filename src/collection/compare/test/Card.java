package collection.compare.test;

public class Card implements Comparable<Card>{
    private Integer number;
    private String shape;
    // 여기 shape도 ENUM 상수로 구현해놓으면 여기서도 더 편하게 정의할 수 있음
    public Card(String shape, Integer number){
        this.number = number;
        this.shape = shape;
    }

    public Integer getNumber() {
        return number;
    }

    public String getShape() {
        return shape;
    }

    @Override
    public int compareTo(Card o) {
        int numberCompare = (number.compareTo(o.number));
        return (numberCompare != 0) ? numberCompare : shape.compareTo(o.getShape());
    }
}
