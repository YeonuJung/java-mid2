package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    // 재사용성이 올라갔지만 타입 안정성이 낮아짐, 그리고 다운캐스팅도 해주어야 함
    public static void main(String[] args) {
        AnimallHospitalV1 dogHospital = new AnimallHospitalV1();
        AnimallHospitalV1 catHospital = new AnimallHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();

        // 문제1: 개 병원에 고양이 전달
         dogHospital.set(cat);  // 매개변수 체크 실패: 컴파일 오류 발생 X

        // 문제2: 개 타입 반환 (다운 캐스팅 필요)
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
