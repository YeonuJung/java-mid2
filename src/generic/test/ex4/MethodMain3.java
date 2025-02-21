package generic.test.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {

    public static void main(String[] args) {
        // 제네릭 타입보다 제네릭 메서드가 우선순위가 더 높다
        // 왜냐? 제네릭 메서드는 메서드를 호출할 때 타입이 결정되기 때문에
        // 제네릭 메서드의 타입은 메서드 내부에서 유효, 즉 제네릭 타입과 제네릭 메서드의 타입은 별개
        // 둘의 이름이 같으면 반드시 이름을 다르게 설정해주기
        Cat cat = new Cat("냐옹이", 100);
        Dog dog = new Dog("멍멍이", 200);
        ComplexBox<Dog> dogComplexBox = new ComplexBox<>();
        dogComplexBox.set(dog);
        dogComplexBox.printAnimal(cat);

    }
}
