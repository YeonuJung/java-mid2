package collection.array;

import java.util.Arrays;

public class MyArrayListV4<E> {
    // 제네릭을 도입하면 제네릭의 타입 매개변수를 생성자에 사용할 수 없는 한계가 있다.
    // 따라서 생성자 부분은 Object를 사용해주고, 값을 담는 배열도 Object배열로 선언해야 한다.
    // 하지만 값을 받고, 반환하는 곳만 제네릭 타입으로 맞춰준다면? <-- 여기가 핵심!!
    // 어차피 Object배열에 들어오는 값은 제네릭 타입으로 고정되기 때문에
    // 반환할 때 해당 타입으로 다운캐스팅해줘도 전혀 문제될 게 없다. 왜냐? 값이 제네릭 타입으로 고정된 값만 들어오니깐
    // 그래서 Object 타입으로 배열을 만들더라도 사실상 제네릭 타입의 요소들만 들어올 수 있어서 문제가 되지 않는다.
    // 생성자 부분만 타입 이레이저에 의해서 어쩔 수 없이 제네릭을 사용할 수 없으니 컴파일 이후에 대체될 Object를 사용하는 것
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV4(){
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV4(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(E e){
        if(size == elementData.length){
            grow();
        }
        elementData[size] = e;
        size++;
    }

    public void add(int index, E e){
        if(size == elementData.length){
            grow();
        }
        // 데이터 이동
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }
    // 코드 추가, 요소의 마지막부터 index까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for(int i = size; i > index; i--){
            elementData[i] = elementData[i - 1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        // 배열을 새로 만들고 기존 배열을 새로운 배열에 복사
        /*
        Object[] newArr = new Object[newCapacity];
        for (int i = 0; i < elementData.length; i++) {
            newArr[i] = elementData[i];
        }
        */

        // 참조를 새로운 배열로 바꾸기
        elementData = Arrays.copyOf(elementData, newCapacity);
    }
    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elementData[index];
    }

    public E set(int index, E element){
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }
    // 코드 추가
    public E remove(int index){
        E oldValue = get(index);
        shiftLeftFrom(index);
        size--;
        // 지우고 왼쪽으로 밀고 남은 기존 마지막 값은 지워줘야함
        elementData[size] = null;
        return oldValue;
    }
    // 코드 추가, 요소의 index부터 마지막까지 왼쪽으로 밀기
    private void shiftLeftFrom(int index) {
        for(int i = index; i < size - 1; i++){
            elementData[i] = elementData[i + 1];
        }
    }


    public int indexOf(E o){
        for(int i = 0; i < size; i++){
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

    public String toString(){
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size=" + size + ", capacity=" + elementData.length;
    }

}

