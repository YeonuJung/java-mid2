package generic.test.ex3;


import generic.animal.Animal;

// 제네릭을 쓰지만 Animal이나 그 자식 타입만 받을 수 있도록 제한
public class AnimallHospitalV3<T extends Animal>{
    private T animal;

    public T get() {
        return animal;
    }

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkUp(){
         System.out.println("동물 이름: " + animal.getName());
         System.out.println("동물 크기: " + animal.getSize());
         animal.sound();
    }

    public T bigger(T target){
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
