package generic.test.ex3;


public class AnimallHospitalV2<T>{
    private T animal;

    public T get() {
        return animal;
    }

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkUp(){
        // T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용

        // 컴파일 오류
        // System.out.println("동물 이름: " + animal.getName());
        // System.out.println("동물 크기: " + animal.size());
        // animal.sound();
    }

    public T bigger(T target){
        // 컴파일 오류
       // return animal.size() > target.size() ? animal : target;
        return null;
    }
}
