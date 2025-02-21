package generic.test.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        // 다운 캐스팅 필요(귀찮음)
        Integer result = (Integer) GenericMethod.objMethod(i);
        // 타입 인자 명시적 전달 (제네릭)
        Integer genericResult = GenericMethod.<Integer>genericMethod(i);
        String genericResult2 = GenericMethod.<String>genericMethod("String");
        Integer genericResult4 = GenericMethod.<Integer>numberMethod(i);

        // 제네릭 타입은 스태틱 메서드에 타입 매개변수를 사용할 수 없다
        // 왜냐? 제네릭 타입은 인스턴스가 생성될 때 결정되는데
        // 스태틱 메서드는 클래스 단위로 작동하기 때문에 인스턴스의 생성과는 무관하기 때문
        // 만약 스태틱 메서드에 제네릭을 도입하려면 제네릭 메서드를 사용하면 된다

        // 제네릭 메서드를 호출할 때마다 타입을 명시하기 귀찮기 때문에 자바가 알아서 값을 보고 타입추론을 해줌
        Integer genericResult5 = GenericMethod.genericMethod(i);

    }
}
