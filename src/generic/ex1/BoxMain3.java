package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점에 T의 타입 결정
        integerBox.setValue(10);
        // integerBox.setValue("문자"); // Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.getValue(); // 다운 캐스팅 필요 X
        System.out.println("integer = " + integer);
        // 제네릭을 사용하면 생성 시점에 타입을 결정하기 때문에 모든 타입 받을 수 있음
        // 즉, Object클래스를 사용하지 않아도 재사용성을 높일 수 있음
        // 뿐만 아니라 Object클래스를 사용했을 떄의 문제인 타입 안정성 또한 가질 수 있다

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.setValue("문자");
        String string = stringBox.getValue();
        System.out.println("string = " + string);

        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.setValue(1.5);
        Double doubleValue = doubleBox.getValue();
        System.out.println("doubleValue = " + doubleValue);

        // 타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();
    }
}
