package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    // 제네릭과 더불어 타입 매개변수를 제한해서 타입 안정성을 지키고 상위 타입의 원하는 기능까지 사용할 수 있다
    public static void main(String[] args) {
        AnimallHospitalV3<Dog> dogHospital = new AnimallHospitalV3<>();
        AnimallHospitalV3<Cat> catHospital = new AnimallHospitalV3<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();

        // 문제1: 개 병원에 고양이 전달
        // 컴파일 오류 발생(타입 안정성 덕분에)
        //  dogHospital.set(cat);

        // 문제2: 개 타입 반환 (다운 캐스팅 불필요)
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
