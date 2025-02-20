package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {

        ObjectBox integerBox = new ObjectBox();
        integerBox.setValue(10);
        Integer integer = (Integer) integerBox.getValue(); // Object -> Integer 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.setValue("hello");
        String string = (String) stringBox.getValue(); // Object -> String 캐스팅
        System.out.println("string = " + string);

        integerBox.setValue("문자100");
        Integer result = (Integer) integerBox.getValue(); // String -> Integer 캐스팅 예외
        System.out.println("result = " + result); // 캐스팅 오류 발생

        // 이처럼 Object는 모든 객체를 담을 수 있기 때문에 다양한 타입을 담을 수 있어
        // 값을 받기 위한 클래스를 별도로 여러개 만드는 불편함을 해소할 수 있다. 하지만
        // 모든 객체를 받을 수 있기 때문에 잘못된 타입을 받을 수 있는 가능성을 배제할 수 없다.
        // 코드 재사용성은 높아졌지만 타입 안정성이 떨어진 것
        // 이를 해결하려면? 제네릭 활용
    }
}
