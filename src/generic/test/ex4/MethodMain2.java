package generic.test.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog1 = new Dog("멍멍이1", 200);
        Dog dog2 = new Dog("멍멍이2", 100);
        Cat cat = new Cat("냐옹이", 300);

        AnimalMethod.checkUp(dog1);
        AnimalMethod.checkUp(dog2);
        AnimalMethod.checkUp(cat);

        Dog biggerDog = AnimalMethod.bigger(dog1, dog2);
        System.out.println("biggerDog = " + biggerDog);
    }
}
