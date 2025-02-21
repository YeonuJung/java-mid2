package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    // 재사용성과 타입 안정성이 기존보다는 올라갔지만 타입인자로 모든 타입을 받아서 생성할 수 있는 문제 발생
    public static void main(String[] args) {
        AnimallHospitalV2<Dog> dogHospital = new AnimallHospitalV2<>();
        AnimallHospitalV2<Cat> catHospital = new AnimallHospitalV2<>();
        // Integer랑 String도 받을 수 있음
        // 즉, 동물과 관련 없는 타입도 타입의 인자로 받아지는 문제
        AnimallHospitalV2<Integer> integerHospital = new AnimallHospitalV2<>();
        AnimallHospitalV2<String> stringHospital = new AnimallHospitalV2<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();

        // 문제1: 개 병원에 고양이 전달
         // dogHospital.set(cat); // 컴파일 오류(타입 오류)

        // 문제2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
