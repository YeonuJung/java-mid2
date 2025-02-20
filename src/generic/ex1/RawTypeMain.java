package generic.ex1;

public class RawTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        // GenericBox<Object> integerBox = new GenericBox<>(); // 이것과 동일
        // 로 타입은 사용하지 X
        integerBox.setValue(10);
        Integer result = (Integer) integerBox.getValue();
        System.out.println("result = " + result);
    }
}
